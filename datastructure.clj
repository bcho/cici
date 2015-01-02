; Basic structure: sequential, map, set

; Sequential

; Equals -> has same values & order
(= [1 2 3] '(1 2 3))

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
