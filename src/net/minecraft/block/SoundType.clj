(ns net.minecraft.block.SoundType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block SoundType]))

(defn ->sound-type
  "Constructor.

  volume-in - `float`
  pitch-in - `float`
  break-sound-in - `net.minecraft.util.SoundEvent`
  step-sound-in - `net.minecraft.util.SoundEvent`
  place-sound-in - `net.minecraft.util.SoundEvent`
  hit-sound-in - `net.minecraft.util.SoundEvent`
  fall-sound-in - `net.minecraft.util.SoundEvent`"
  (^SoundType [^Float volume-in ^Float pitch-in ^net.minecraft.util.SoundEvent break-sound-in ^net.minecraft.util.SoundEvent step-sound-in ^net.minecraft.util.SoundEvent place-sound-in ^net.minecraft.util.SoundEvent hit-sound-in ^net.minecraft.util.SoundEvent fall-sound-in]
    (new SoundType volume-in pitch-in break-sound-in step-sound-in place-sound-in hit-sound-in fall-sound-in)))

(def *-wood
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/WOOD)

(def *-ground
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/GROUND)

(def *-plant
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/PLANT)

(def *-stone
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/STONE)

(def *-metal
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/METAL)

(def *-glass
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/GLASS)

(def *-cloth
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/CLOTH)

(def *-sand
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/SAND)

(def *-snow
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/SNOW)

(def *-ladder
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/LADDER)

(def *-anvil
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/ANVIL)

(def *-slime
  "Static Constant.

  type: net.minecraft.block.SoundType"
  SoundType/SLIME)

(defn volume
  "Instance Constant.

  type: float"
  (^Float [^SoundType this]
    (-> this .-volume)))

(defn pitch
  "Instance Constant.

  type: float"
  (^Float [^SoundType this]
    (-> this .-pitch)))

(defn get-volume
  "returns: `float`"
  (^Float [^SoundType this]
    (-> this (.getVolume))))

(defn get-pitch
  "returns: `float`"
  (^Float [^SoundType this]
    (-> this (.getPitch))))

(defn get-break-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SoundType this]
    (-> this (.getBreakSound))))

(defn get-step-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SoundType this]
    (-> this (.getStepSound))))

(defn get-place-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SoundType this]
    (-> this (.getPlaceSound))))

(defn get-hit-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SoundType this]
    (-> this (.getHitSound))))

(defn get-fall-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SoundType this]
    (-> this (.getFallSound))))

