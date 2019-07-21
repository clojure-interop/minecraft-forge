(ns net.minecraft.entity.player.PlayerCapabilities
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player PlayerCapabilities]))

(defn ->player-capabilities
  "Constructor."
  (^PlayerCapabilities []
    (new PlayerCapabilities )))

(defn disable-damage
  "Instance Field.

  type: boolean"
  (^Boolean [^PlayerCapabilities this]
    (-> this .-disableDamage)))

(defn is-flying
  "Instance Field.

  type: boolean"
  (^Boolean [^PlayerCapabilities this]
    (-> this .-isFlying)))

(defn allow-flying
  "Instance Field.

  type: boolean"
  (^Boolean [^PlayerCapabilities this]
    (-> this .-allowFlying)))

(defn is-creative-mode
  "Instance Field.

  type: boolean"
  (^Boolean [^PlayerCapabilities this]
    (-> this .-isCreativeMode)))

(defn allow-edit
  "Instance Field.

  type: boolean"
  (^Boolean [^PlayerCapabilities this]
    (-> this .-allowEdit)))

(defn write-capabilities-to-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^PlayerCapabilities this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.writeCapabilitiesToNBT tag-compound))))

(defn read-capabilities-from-nbt
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^PlayerCapabilities this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readCapabilitiesFromNBT tag-compound))))

(defn get-fly-speed
  "returns: `float`"
  (^Float [^PlayerCapabilities this]
    (-> this (.getFlySpeed))))

(defn set-fly-speed
  "speed - `float`"
  ([^PlayerCapabilities this ^Float speed]
    (-> this (.setFlySpeed speed))))

(defn get-walk-speed
  "returns: `float`"
  (^Float [^PlayerCapabilities this]
    (-> this (.getWalkSpeed))))

(defn set-player-walk-speed
  "speed - `float`"
  ([^PlayerCapabilities this ^Float speed]
    (-> this (.setPlayerWalkSpeed speed))))

