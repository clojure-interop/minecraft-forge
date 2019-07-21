(ns net.minecraft.entity.item.EntityFallingBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityFallingBlock]))

(defn ->entity-falling-block
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  falling-block-state - `net.minecraft.block.state.IBlockState`"
  (^EntityFallingBlock [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.block.state.IBlockState falling-block-state]
    (new EntityFallingBlock world-in x y z falling-block-state))
  (^EntityFallingBlock [^net.minecraft.world.World world-in]
    (new EntityFallingBlock world-in)))

(defn fall-time
  "Instance Field.

  type: int"
  (^Integer [^EntityFallingBlock this]
    (-> this .-fallTime)))

(defn should-drop-item
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityFallingBlock this]
    (-> this .-shouldDropItem)))

(defn tile-entity-data
  "Instance Field.

  type: net.minecraft.nbt.NBTTagCompound"
  (^net.minecraft.nbt.NBTTagCompound [^EntityFallingBlock this]
    (-> this .-tileEntityData)))

(defn *register-fixes-falling-block
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityFallingBlock/registerFixesFallingBlock fixer)))

(defn set-origin
  "p-184530-1 - `net.minecraft.util.math.BlockPos`"
  ([^EntityFallingBlock this ^net.minecraft.util.math.BlockPos p-184530-1]
    (-> this (.setOrigin p-184530-1))))

(defn add-entity-crash-info
  "category - `net.minecraft.crash.CrashReportCategory`"
  ([^EntityFallingBlock this ^net.minecraft.crash.CrashReportCategory category]
    (-> this (.addEntityCrashInfo category))))

(defn on-update
  ""
  ([^EntityFallingBlock this]
    (-> this (.onUpdate))))

(defn get-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityFallingBlock this]
    (-> this (.getBlock))))

(defn get-origin
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityFallingBlock this]
    (-> this (.getOrigin))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityFallingBlock this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn ignore-item-entity-data
  "returns: `boolean`"
  (^Boolean [^EntityFallingBlock this]
    (-> this (.ignoreItemEntityData))))

(defn can-render-on-fire?
  "returns: `boolean`"
  (^Boolean [^EntityFallingBlock this]
    (-> this (.canRenderOnFire))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityFallingBlock this]
    (-> this (.canBeCollidedWith))))

(defn get-world-obj
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityFallingBlock this]
    (-> this (.getWorldObj))))

(defn set-hurt-entities
  "p-145806-1 - `boolean`"
  ([^EntityFallingBlock this ^Boolean p-145806-1]
    (-> this (.setHurtEntities p-145806-1))))

