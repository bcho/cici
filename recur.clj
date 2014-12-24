(defn print-down-form [x]
  (when (pos? x)          ; find out what's ``when`` with (doc when)
    (println x)
    ; Step 1: (dec x) <- assume this is new-x
    ; Step 2: bind x with new-x
    ; Step 3: go to print-down-from's start
    (recur (dec x))))
