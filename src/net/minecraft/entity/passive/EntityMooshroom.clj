(ns net.minecraft.entity.passive.EntityMooshroom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityMooshroom]))

(defn ->entity-mooshroom
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityMooshroom [^net.minecraft.world.World world-in]
    (new EntityMooshroom world-in)))

(defn *register-fixes-mooshroom
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMooshroom/registerFixesMooshroom fixer)))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMooshroom this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityMooshroom`"
  (^net.minecraft.entity.passive.EntityMooshroom [^EntityMooshroom this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^EntityMooshroom this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn on-sheared
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^EntityMooshroom this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

