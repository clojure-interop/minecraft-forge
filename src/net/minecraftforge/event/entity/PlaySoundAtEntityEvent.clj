(ns net.minecraftforge.event.entity.PlaySoundAtEntityEvent
  "PlaySoundAtEntityEvent is fired a sound is to be played at an Entity
  This event is fired whenever a sound is set to be played at an Entity such as in
  EntityPlayerSP.playSound(SoundEvent, float, float) and World.playSound(EntityPlayer, double, double, double, SoundEvent, SoundCategory, float, float).

  name contains the name of the sound to be played at the Entity.
  volume contains the volume at which the sound is to be played originally.
  pitch contains the pitch at which the sound is to be played originally.
  newVolume contains the volume at which the sound is actually played.
  newPitch contains the pitch at which the sound is actually played.
  Changing the name field will cause the sound of this name to be played instead of the originally intended sound.

  This event is Cancelable.
  If this event is canceled, the sound is not played.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity PlaySoundAtEntityEvent]))

(defn ->play-sound-at-entity-event
  "Constructor.

  entity - `net.minecraft.entity.Entity`
  name - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  volume - `float`
  pitch - `float`"
  (^PlaySoundAtEntityEvent [^net.minecraft.entity.Entity entity ^net.minecraft.util.SoundEvent name ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch]
    (new PlaySoundAtEntityEvent entity name category volume pitch)))

(defn get-volume
  "returns: `float`"
  (^Float [^PlaySoundAtEntityEvent this]
    (-> this (.getVolume))))

(defn get-default-volume
  "returns: `float`"
  (^Float [^PlaySoundAtEntityEvent this]
    (-> this (.getDefaultVolume))))

(defn get-pitch
  "returns: `float`"
  (^Float [^PlaySoundAtEntityEvent this]
    (-> this (.getPitch))))

(defn get-default-pitch
  "returns: `float`"
  (^Float [^PlaySoundAtEntityEvent this]
    (-> this (.getDefaultPitch))))

(defn get-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^PlaySoundAtEntityEvent this]
    (-> this (.getCategory))))

(defn set-sound
  "value - `net.minecraft.util.SoundEvent`"
  ([^PlaySoundAtEntityEvent this ^net.minecraft.util.SoundEvent value]
    (-> this (.setSound value))))

(defn get-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^PlaySoundAtEntityEvent this]
    (-> this (.getSound))))

(defn set-pitch
  "value - `float`"
  ([^PlaySoundAtEntityEvent this ^Float value]
    (-> this (.setPitch value))))

(defn set-category
  "category - `net.minecraft.util.SoundCategory`"
  ([^PlaySoundAtEntityEvent this ^net.minecraft.util.SoundCategory category]
    (-> this (.setCategory category))))

(defn set-volume
  "value - `float`"
  ([^PlaySoundAtEntityEvent this ^Float value]
    (-> this (.setVolume value))))

