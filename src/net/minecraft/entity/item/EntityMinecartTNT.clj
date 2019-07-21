(ns net.minecraft.entity.item.EntityMinecartTNT
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartTNT]))

(defn ->entity-minecart-tnt
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartTNT [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartTNT world-in x y z))
  (^EntityMinecartTNT [^net.minecraft.world.World world-in]
    (new EntityMinecartTNT world-in)))

(defn *register-fixes-minecart-tnt
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartTNT/registerFixesMinecartTNT fixer)))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartTNT this]
    (-> this (.getType))))

(defn verify-explosion
  "explosion-in - `net.minecraft.world.Explosion`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-state-in - `net.minecraft.block.state.IBlockState`
  p-174816-5 - `float`

  returns: `boolean`"
  (^Boolean [^EntityMinecartTNT this ^net.minecraft.world.Explosion explosion-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block-state-in ^Float p-174816-5]
    (-> this (.verifyExplosion explosion-in world-in pos block-state-in p-174816-5))))

(defn on-update
  ""
  ([^EntityMinecartTNT this]
    (-> this (.onUpdate))))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecartTNT this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartTNT this]
    (-> this (.getDefaultDisplayTile))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityMinecartTNT this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityMinecartTNT this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn on-activator-rail-pass
  "x - `int`
  y - `int`
  z - `int`
  receiving-power - `boolean`"
  ([^EntityMinecartTNT this ^Integer x ^Integer y ^Integer z ^Boolean receiving-power]
    (-> this (.onActivatorRailPass x y z receiving-power))))

(defn get-fuse-ticks
  "returns: `int`"
  (^Integer [^EntityMinecartTNT this]
    (-> this (.getFuseTicks))))

(defn ignited?
  "returns: `boolean`"
  (^Boolean [^EntityMinecartTNT this]
    (-> this (.isIgnited))))

(defn get-explosion-resistance
  "explosion-in - `net.minecraft.world.Explosion`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-state-in - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^EntityMinecartTNT this ^net.minecraft.world.Explosion explosion-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block-state-in]
    (-> this (.getExplosionResistance explosion-in world-in pos block-state-in))))

(defn ignite
  ""
  ([^EntityMinecartTNT this]
    (-> this (.ignite))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityMinecartTNT this ^Byte id]
    (-> this (.handleStatusUpdate id))))

