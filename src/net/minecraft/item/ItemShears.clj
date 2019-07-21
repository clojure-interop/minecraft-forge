(ns net.minecraft.item.ItemShears
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemShears]))

(defn ->item-shears
  "Constructor."
  (^ItemShears []
    (new ItemShears )))

(defn on-block-destroyed
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemShears this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onBlockDestroyed stack world-in state pos entity-living))))

(defn can-harvest-block?
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemShears this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemShears this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

(defn item-interaction-for-entity
  "itemstack - `net.minecraft.item.ItemStack`
  player - `net.minecraft.entity.player.EntityPlayer`
  entity - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^ItemShears this ^net.minecraft.item.ItemStack itemstack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.EnumHand hand]
    (-> this (.itemInteractionForEntity itemstack player entity hand))))

(defn on-block-start-break
  "Description copied from class: Item

  itemstack - The current ItemStack - `net.minecraft.item.ItemStack`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`
  player - The Player that is wielding the item - `net.minecraft.entity.player.EntityPlayer`

  returns: True to prevent harvesting, false to continue as normal - `boolean`"
  (^Boolean [^ItemShears this ^net.minecraft.item.ItemStack itemstack ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onBlockStartBreak itemstack pos player))))

