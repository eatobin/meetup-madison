(ns meetup.madison)

(defn verse-one
  [color1 color2]
  (str "Roses are " color1 ", violets are " color2 ","))

(defn verse-two
  [color3 who]
  {:sugar-is color3 :and-so-are who})

(->>
  [44 55 66]
  (map dec)
  (filter #(not= 54 %)))

(defn verse-three
  [x y]
  (str "I am the sum of " (+ x y)))
