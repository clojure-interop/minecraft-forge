(ns net.minecraft.client.audio.GuardianSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio GuardianSound]))

(defn ->guardian-sound
  "Constructor.

  guardian - `net.minecraft.entity.monster.EntityGuardian`"
  (^GuardianSound [^net.minecraft.entity.monster.EntityGuardian guardian]
    (new GuardianSound guardian)))

(defn update
  ""
  ([^GuardianSound this]
    (-> this (.update))))

