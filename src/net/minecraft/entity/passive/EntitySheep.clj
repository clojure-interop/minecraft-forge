(ns net.minecraft.entity.passive.EntitySheep
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntitySheep]))

(defn ->entity-sheep
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySheep [^net.minecraft.world.World world-in]
    (new EntitySheep world-in)))

(defn *get-dye-rgb
  "dye-color - `net.minecraft.item.EnumDyeColor`

  returns: `float[]`"
  ([^net.minecraft.item.EnumDyeColor dye-color]
    (EntitySheep/getDyeRgb dye-color)))

(defn *register-fixes-sheep
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySheep/registerFixesSheep fixer)))

(defn *get-random-sheep-color
  "random - `java.util.Random`

  returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^java.util.Random random]
    (EntitySheep/getRandomSheepColor random)))

(defn get-head-rotation-point-y
  "p-70894-1 - `float`

  returns: `float`"
  (^Float [^EntitySheep this ^Float p-70894-1]
    (-> this (.getHeadRotationPointY p-70894-1))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySheep this]
    (-> this (.getEyeHeight))))

(defn set-sheared
  "sheared - `boolean`"
  ([^EntitySheep this ^Boolean sheared]
    (-> this (.setSheared sheared))))

(defn set-fleece-color
  "color - `net.minecraft.item.EnumDyeColor`"
  ([^EntitySheep this ^net.minecraft.item.EnumDyeColor color]
    (-> this (.setFleeceColor color))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntitySheep this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntitySheep`"
  (^net.minecraft.entity.passive.EntitySheep [^EntitySheep this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn on-sheared
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^EntitySheep this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySheep this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-head-rotation-angle-x
  "p-70890-1 - `float`

  returns: `float`"
  (^Float [^EntitySheep this ^Float p-70890-1]
    (-> this (.getHeadRotationAngleX p-70890-1))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySheep this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-sheared?
  "returns: `boolean`"
  (^Boolean [^EntitySheep this]
    (-> this (.getSheared))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^EntitySheep this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn eat-grass-bonus
  ""
  ([^EntitySheep this]
    (-> this (.eatGrassBonus))))

(defn get-fleece-color
  "returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^EntitySheep this]
    (-> this (.getFleeceColor))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntitySheep this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn handle-status-update
  "id - `byte`"
  ([^EntitySheep this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn on-living-update
  ""
  ([^EntitySheep this]
    (-> this (.onLivingUpdate))))

