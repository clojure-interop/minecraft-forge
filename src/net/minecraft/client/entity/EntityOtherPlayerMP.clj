(ns net.minecraft.client.entity.EntityOtherPlayerMP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.entity EntityOtherPlayerMP]))

(defn ->entity-other-player-mp
  "Constructor.

  world-in - `net.minecraft.world.World`
  game-profile-in - `com.mojang.authlib.GameProfile`"
  (^EntityOtherPlayerMP [^net.minecraft.world.World world-in ^com.mojang.authlib.GameProfile game-profile-in]
    (new EntityOtherPlayerMP world-in game-profile-in)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityOtherPlayerMP this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityOtherPlayerMP this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityOtherPlayerMP this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn on-update
  ""
  ([^EntityOtherPlayerMP this]
    (-> this (.onUpdate))))

(defn on-living-update
  ""
  ([^EntityOtherPlayerMP this]
    (-> this (.onLivingUpdate))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^EntityOtherPlayerMP this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^EntityOtherPlayerMP this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityOtherPlayerMP this]
    (-> this (.getPosition))))

