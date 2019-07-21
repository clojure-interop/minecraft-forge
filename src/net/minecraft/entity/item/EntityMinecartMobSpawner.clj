(ns net.minecraft.entity.item.EntityMinecartMobSpawner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartMobSpawner]))

(defn ->entity-minecart-mob-spawner
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartMobSpawner [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartMobSpawner world-in x y z))
  (^EntityMinecartMobSpawner [^net.minecraft.world.World world-in]
    (new EntityMinecartMobSpawner world-in)))

(defn *register-fixes-minecart-mob-spawner
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartMobSpawner/registerFixesMinecartMobSpawner fixer)))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartMobSpawner this]
    (-> this (.getType))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartMobSpawner this]
    (-> this (.getDefaultDisplayTile))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityMinecartMobSpawner this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn on-update
  ""
  ([^EntityMinecartMobSpawner this]
    (-> this (.onUpdate))))

