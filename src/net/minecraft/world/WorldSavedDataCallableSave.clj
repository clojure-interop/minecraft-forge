(ns net.minecraft.world.WorldSavedDataCallableSave
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldSavedDataCallableSave]))

(defn ->world-saved-data-callable-save
  "Constructor.

  data-in - `net.minecraft.world.WorldSavedData`"
  (^WorldSavedDataCallableSave [^net.minecraft.world.WorldSavedData data-in]
    (new WorldSavedDataCallableSave data-in)))

(defn run
  ""
  ([^WorldSavedDataCallableSave this]
    (-> this (.run))))

