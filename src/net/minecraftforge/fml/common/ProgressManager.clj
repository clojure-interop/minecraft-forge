(ns net.minecraftforge.fml.common.ProgressManager
  "Not a fully fleshed out API, may change in future MC versions.
  However feel free to use and suggest additions."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ProgressManager]))

(defn ->progress-manager
  "Constructor."
  (^ProgressManager []
    (new ProgressManager )))

(defn *push
  "Not a fully fleshed out API, may change in future MC versions.
   However feel free to use and suggest additions.

  title - `java.lang.String`
  steps - `int`
  time-each-step - `boolean`

  returns: `net.minecraftforge.fml.common.ProgressManager$ProgressBar`"
  (^net.minecraftforge.fml.common.ProgressManager$ProgressBar [^java.lang.String title ^Integer steps ^Boolean time-each-step]
    (ProgressManager/push title steps time-each-step))
  (^net.minecraftforge.fml.common.ProgressManager$ProgressBar [^java.lang.String title ^Integer steps]
    (ProgressManager/push title steps)))

(defn *pop
  "Not a fully fleshed out API, may change in future MC versions.
   However feel free to use and suggest additions.

  bar - `net.minecraftforge.fml.common.ProgressManager$ProgressBar`"
  ([^net.minecraftforge.fml.common.ProgressManager$ProgressBar bar]
    (ProgressManager/pop bar)))

(defn *bar-iterator
  "returns: `java.util.Iterator<net.minecraftforge.fml.common.ProgressManager$ProgressBar>`"
  (^java.util.Iterator []
    (ProgressManager/barIterator )))

