(ns net.minecraft.item.ItemBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBlock]))

(defn ->item-block
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemBlock [^net.minecraft.block.Block block]
    (new ItemBlock block)))

(defn block
  "Instance Constant.

  type: net.minecraft.block.Block"
  (^net.minecraft.block.Block [^ItemBlock this]
    (-> this .-block)))

(defn *set-tile-entity-nbt
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack stack-in]
    (ItemBlock/setTileEntityNBT world-in player pos stack-in)))

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
  (^net.minecraft.util.EnumActionResult [^ItemBlock this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn can-place-block-on-side?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`
  player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (-> this (.canPlaceBlockOnSide world-in pos side player stack))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemBlock this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack)))
  (^java.lang.String [^ItemBlock this]
    (-> this (.getUnlocalizedName))))

(defn get-creative-tab
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^ItemBlock this]
    (-> this (.getCreativeTab))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemBlock this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemBlock this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^ItemBlock this]
    (-> this (.getBlock))))

(defn place-block-at
  "Called to actually place the block, after the location is determined
   and all permission checks have been made.

  stack - The item stack that was used to place the block. This can be changed inside the method. - `net.minecraft.item.ItemStack`
  player - The player who is placing the block. Can be null if the block is not being placed by a player. - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - The side the player (or machine) right-clicked on. - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`
  new-state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemBlock this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Float hit-x ^Float hit-y ^Float hit-z ^net.minecraft.block.state.IBlockState new-state]
    (-> this (.placeBlockAt stack player world pos side hit-x hit-y hit-z new-state))))

