(ns solution-test
  (:require [solution :as sut]
            [clojure.test :as t]))

(t/deftest get-two-test
  (t/testing "Objetivo negativo"
    (t/is (= (sut/get-two '(-10 2 3 1 5 1 2 -5) -15) '(0 7))))
  (t/testing "Diferente Indice"
    (t/is (= (sut/get-two '(115 115) 230) '(0 1))))
  (t/testing ""
    (t/is (= (sut/get-two '(9 1 3 4 7 9 18) 16) '(0 4))))
  (t/testing ""
    (t/is (= (sut/get-two '(-10 2 3 1 5 4 2 -5) 6) '(3 4))))
  (t/testing "Objetivo 0"
    (t/is (= (sut/get-two '(2 0 12 123 321 32 0 31 1 2) 0) '(1 6)))))

(t/deftest fizz-buzz-test
  (t/testing "5"
    (t/is (= (sut/fizz-buzz 5) '(1 2 "F" 4 "B"))))
  (t/testing "2"
    (t/is (= (sut/fizz-buzz 2) '(1 2))))
  (t/testing "15"
    (t/is (= (sut/fizz-buzz 16) '(1 2 "F" 4 "B" "F" 7 8 "F" "B" 11 "F" 13 14 "FB")))))

(t/deftest collatz-test
  (t/testing "12"
    (t/is (= (sut/lista-c 12) '(12 6 3 10 5 16 8 4 2 1))))
  (t/testing "7"
    (t/is (= (sut/lista-c 7) '(7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1))))
  (t/testing "20"
    (t/is (= (sut/lista-c 20) '(20 10 5 16 8 4 2 1))))
  (t/testing "123456"
    (t/is (= (sut/lista-c 123456) '(123456 61728 30864 15432 7716 3858 1929 5788 2894 1447 4342 2171 6514 3257 9772 4886 2443 7330 3665 10996 5498 2749 8248 4124 2062 1031 3094 1547 4642 2321 6964 3482 1741 5224 2612 1306 653 1960 980 490 245 736 368 184 92 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1)))))

(t/deftest suma-test
  (t/testing "A es 0"
    (t/is (= (sut/suma 0 5) 5)))
  (t/testing "B es 0"
    (t/is (= (sut/suma 7 0) 7)))
  (t/testing "Es negativo"
    (t/is (= (sut/suma 20 -1) 19)))
  (t/testing ""
    (t/is (= (sut/suma 123 -11) 112))))

(t/deftest pares?-test
  (t/testing "Todos pares"
    (t/is (true? (sut/pares? '(-10 2 4 8 12 112 998 4)))))
  (t/testing "Al menos uno impar"
    (t/is (false? (sut/pares? '(2 4 8 115 96 34)))))
  (t/testing "Ultimo impar"
    (t/is (false? (sut/pares? '(92 16 38 34 22 12 17)))))
  (t/testing ""
    (t/is (false? (sut/pares? '(-10 2 3 1 5 4 2 -5)))))
  (t/testing ""
    (t/is (true? (sut/pares? '(2 0 -12 124 322 32 0 32 4 2))))))


