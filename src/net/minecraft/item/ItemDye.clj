(ns net.minecraft.item.ItemDye
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemDye]))

(defn ->item-dye
  "Constructor."
  (^ItemDye []
    (new ItemDye )))

(def *-dye-colors
  "Static Constant.

  type: int[]"
  ItemDye/DYE_COLORS)

(defn *apply-bonemeal
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  target - `net.minecraft.util.math.BlockPos`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos target ^net.minecraft.entity.player.EntityPlayer player]
    (ItemDye/applyBonemeal stack world-in target player))
  (^Boolean [^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos target]
    (ItemDye/applyBonemeal stack world-in target)))

(defn *spawn-bonemeal-particles
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  amount - `int`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Integer amount]
    (ItemDye/spawnBonemealParticles world-in pos amount)))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemDye this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

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
  (^net.minecraft.util.EnumActionResult [^ItemDye this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn item-interaction-for-entity
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^ItemDye this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.util.EnumHand hand]
    (-> this (.itemInteractionForEntity stack player-in target hand))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemDye this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

