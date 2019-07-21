(ns net.minecraft.world.Explosion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world Explosion]))

(defn ->explosion
  "Constructor.

  world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  size - `float`
  flaming - `boolean`
  smoking - `boolean`
  affected-positions - `java.util.List`"
  (^Explosion [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float size ^Boolean flaming ^Boolean smoking ^java.util.List affected-positions]
    (new Explosion world-in entity-in x y z size flaming smoking affected-positions))
  (^Explosion [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float size ^Boolean flaming ^Boolean smoking]
    (new Explosion world-in entity-in x y z size flaming smoking))
  (^Explosion [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float size ^java.util.List affected-positions]
    (new Explosion world-in entity-in x y z size affected-positions)))

(defn do-explosion-a
  ""
  ([^Explosion this]
    (-> this (.doExplosionA))))

(defn do-explosion-b
  "spawn-particles - `boolean`"
  ([^Explosion this ^Boolean spawn-particles]
    (-> this (.doExplosionB spawn-particles))))

(defn get-player-knockback-map
  "returns: `java.util.Map<net.minecraft.entity.player.EntityPlayer,net.minecraft.util.math.Vec3d>`"
  (^java.util.Map [^Explosion this]
    (-> this (.getPlayerKnockbackMap))))

(defn get-explosive-placed-by
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^Explosion this]
    (-> this (.getExplosivePlacedBy))))

(defn clear-affected-block-positions
  ""
  ([^Explosion this]
    (-> this (.clearAffectedBlockPositions))))

(defn get-affected-block-positions
  "returns: `java.util.List<net.minecraft.util.math.BlockPos>`"
  (^java.util.List [^Explosion this]
    (-> this (.getAffectedBlockPositions))))

(defn get-position
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Explosion this]
    (-> this (.getPosition))))

