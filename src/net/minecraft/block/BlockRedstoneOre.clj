(ns net.minecraft.block.BlockRedstoneOre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRedstoneOre]))

(defn ->block-redstone-ore
  "Constructor.

  is-on - `boolean`"
  (^BlockRedstoneOre [^Boolean is-on]
    (new BlockRedstoneOre is-on)))

(defn on-entity-walk
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityWalk world-in pos entity-in))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockRedstoneOre this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockRedstoneOre this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn on-block-clicked
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onBlockClicked world-in pos player-in))))

(defn on-block-activated
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `boolean`"
  (^Boolean [^BlockRedstoneOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn get-exp-drop
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position - `net.minecraft.util.math.BlockPos`
  fortune - `int`

  returns: Amount of XP from breaking this block. - `int`"
  (^Integer [^BlockRedstoneOre this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.getExpDrop state world pos fortune))))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockRedstoneOre this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockRedstoneOre this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockRedstoneOre this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

