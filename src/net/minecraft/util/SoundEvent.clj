(ns net.minecraft.util.SoundEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util SoundEvent]))

(defn ->sound-event
  "Constructor.

  sound-name-in - `net.minecraft.util.ResourceLocation`"
  (^SoundEvent [^net.minecraft.util.ResourceLocation sound-name-in]
    (new SoundEvent sound-name-in)))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespaced<net.minecraft.util.ResourceLocation,net.minecraft.util.SoundEvent>"
  SoundEvent/REGISTRY)

(defn *register-sounds
  ""
  ([]
    (SoundEvent/registerSounds )))

(defn get-sound-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^SoundEvent this]
    (-> this (.getSoundName))))

