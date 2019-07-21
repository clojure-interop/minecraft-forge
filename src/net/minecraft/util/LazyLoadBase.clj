(ns net.minecraft.util.LazyLoadBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util LazyLoadBase]))

(defn ->lazy-load-base
  "Constructor."
  (^LazyLoadBase []
    (new LazyLoadBase )))

(defn get-value
  "returns: `T`"
  ([^LazyLoadBase this]
    (-> this (.getValue))))

