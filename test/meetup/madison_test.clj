(ns meetup.madison-test
  (:require
   [clojure.test :refer [deftest is]]
   [meetup.madison :as mm]))

(deftest verse-one-test
  (is (= "Roses are red, violets are blue,"
         (mm/verse-one "red" "blue"))))

(deftest verse-two-test
  (is (= {:sugar-is "sweet", :and-so-are "you"}
         (mm/verse-two "sweet" "you"))))

(deftest verse-three-test
  (is (= "I am the sum of 16"
         (mm/verse-three 10 6))))
