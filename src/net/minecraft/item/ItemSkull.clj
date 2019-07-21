(ns net.minecraft.item.ItemSkull
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSkull]))

(defn ->item-skull
  "Constructor."
  (^ItemSkull []
    (new ItemSkull )))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemSkull this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemSkull this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemSkull this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemSkull this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemSkull this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn update-item-stack-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^ItemSkull this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.updateItemStackNBT nbt))))

