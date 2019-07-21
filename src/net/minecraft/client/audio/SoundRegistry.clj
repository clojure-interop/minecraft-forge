(ns net.minecraft.client.audio.SoundRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundRegistry]))

(defn ->sound-registry
  "Constructor."
  (^SoundRegistry []
    (new SoundRegistry )))

(defn add
  "accessor - `net.minecraft.client.audio.SoundEventAccessor`"
  ([^SoundRegistry this ^net.minecraft.client.audio.SoundEventAccessor accessor]
    (-> this (.add accessor))))

(defn clear-map
  ""
  ([^SoundRegistry this]
    (-> this (.clearMap))))

