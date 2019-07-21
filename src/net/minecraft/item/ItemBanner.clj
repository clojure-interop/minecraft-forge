(ns net.minecraft.item.ItemBanner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBanner]))

(defn ->item-banner
  "Constructor."
  (^ItemBanner []
    (new ItemBanner )))

(defn *append-hover-text-from-tile-entity-tag
  "stack - `net.minecraft.item.ItemStack`
  p-185054-1 - `java.util.List`"
  ([^net.minecraft.item.ItemStack stack ^java.util.List p-185054-1]
    (ItemBanner/appendHoverTextFromTileEntityTag stack p-185054-1)))

(defn *make-banner
  "p-190910-0 - `net.minecraft.item.EnumDyeColor`
  p-190910-1 - `net.minecraft.nbt.NBTTagList`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.EnumDyeColor p-190910-0 ^net.minecraft.nbt.NBTTagList p-190910-1]
    (ItemBanner/makeBanner p-190910-0 p-190910-1)))

(defn *get-base-color
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^net.minecraft.item.ItemStack stack]
    (ItemBanner/getBaseColor stack)))

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
  (^net.minecraft.util.EnumActionResult [^ItemBanner this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemBanner this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemBanner this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemBanner this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn get-creative-tab
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^ItemBanner this]
    (-> this (.getCreativeTab))))

