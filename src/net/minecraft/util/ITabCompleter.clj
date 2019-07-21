(ns net.minecraft.util.ITabCompleter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ITabCompleter]))

(defn set-completions
  "new-completions - `java.lang.String`"
  ([^ITabCompleter this ^java.lang.String new-completions]
    (-> this (.setCompletions new-completions))))

