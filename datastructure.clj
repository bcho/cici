; Basic structure: sequential, map, set

; Sequential

; Equals -> has same values & order
(= [1 2 3] '(1 2 3))

; Use conj all the time
(conj '(2 3) 1) ; '(1 2 3)
(conj [2 3] 1)  ; [1 2 3]

; Vector:
; 
; Good at:
; 
; - right hand operations (rpush, rpop)
; - indexed access
; - update items
; - reverse traversal

; vector as stack
;
; push -> conj
; pop  -> pop
; peek -> peek
;
; (can apply to clojure.lang.IPersistentStack)

; map implementation
(defn strict-map2 [f coll]
  (loop [coll coll, acc []]
    (if (empty? coll)
      acc
      (recur (next coll) (conj acc (f (first coll)))))))


; slice
(subvec [1 2 3 4 5] 1 4)


; List:
;
; Baisc data structure in lisp family language.
;
; - left hand operations
; - flavor in using conj over cons


; Set:

; What are equal?

#{[] ()}
;=> #{ [] }  ; because [] and () has same value


; pos

; structure first -> convert different structure into isomorphic structure.
(defn index [coll]
  (cond
    (map? coll) (seq coll)
    (set? coll) (map vector coll coll)
    :else (map vector (iterate inc 0) coll)))

; convert all
(defn pos [pred coll]
  (for [[i v] (index coll) :when (pred v)] i))
