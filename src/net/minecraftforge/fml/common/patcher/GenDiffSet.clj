(ns net.minecraftforge.fml.common.patcher.GenDiffSet
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.patcher GenDiffSet]))

(defn ->gen-diff-set
  "Constructor."
  (^GenDiffSet []
    (new GenDiffSet )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.io.IOException"
  ([args]
    (GenDiffSet/main args)))

