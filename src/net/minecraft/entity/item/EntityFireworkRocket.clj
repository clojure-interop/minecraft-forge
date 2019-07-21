(ns net.minecraft.entity.item.EntityFireworkRocket
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityFireworkRocket]))

(defn ->entity-firework-rocket
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  given-item - `net.minecraft.item.ItemStack`"
  (^EntityFireworkRocket [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.item.ItemStack given-item]
    (new EntityFireworkRocket world-in x y z given-item))
  (^EntityFireworkRocket [^net.minecraft.world.World p-i-47367-1 ^net.minecraft.item.ItemStack p-i-47367-2 ^net.minecraft.entity.EntityLivingBase p-i-47367-3]
    (new EntityFireworkRocket p-i-47367-1 p-i-47367-2 p-i-47367-3))
  (^EntityFireworkRocket [^net.minecraft.world.World world-in]
    (new EntityFireworkRocket world-in)))

(defn *register-fixes-firework-rocket
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityFireworkRocket/registerFixesFireworkRocket fixer)))

(defn in-range-to-render-3d?
  "x - `double`
  y - `double`
  z - `double`

  returns: `boolean`"
  (^Boolean [^EntityFireworkRocket this ^Double x ^Double y ^Double z]
    (-> this (.isInRangeToRender3d x y z))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityFireworkRocket this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn on-update
  ""
  ([^EntityFireworkRocket this]
    (-> this (.onUpdate))))

(defn func-191511-j
  "returns: `boolean`"
  (^Boolean [^EntityFireworkRocket this]
    (-> this (.func_191511_j))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^EntityFireworkRocket this]
    (-> this (.canBeAttackedWithItem))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFireworkRocket this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFireworkRocket this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityFireworkRocket this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityFireworkRocket this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

