(defn print-down-form [x]
  (when (pos? x)          ; find out what's ``when`` with (doc when)
    (println x)
    ; Step 1: (dec x) <- assume this is new-x
    ; Step 2: bind x with new-x
    ; Step 3: go to print-down-from's start
    (recur (dec x))))


(defn sum-down-from [initial-x]
  (loop [sum 0, x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))   ; jump back to the nearest loop or fn method.
      sum)))


; Recur must stay in the tail!
; (fn [x] (recur x) (println x))
