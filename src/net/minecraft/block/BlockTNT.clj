(ns net.minecraft.block.BlockTNT
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockTNT]))

(defn ->block-tnt
  "Constructor."
  (^BlockTNT []
    (new BlockTNT )))

(def *-explode
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockTNT/EXPLODE)

(defn on-entity-collided-with-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityCollidedWithBlock world-in pos state entity-in))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockTNT this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockTNT this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn on-block-destroyed-by-explosion
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  explosion-in - `net.minecraft.world.Explosion`"
  ([^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.Explosion explosion-in]
    (-> this (.onBlockDestroyedByExplosion world-in pos explosion-in))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn on-block-destroyed-by-player
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockDestroyedByPlayer world-in pos state))))

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
  (^Boolean [^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn explode
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  igniter - `net.minecraft.entity.EntityLivingBase`"
  ([^BlockTNT this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.EntityLivingBase igniter]
    (-> this (.explode world-in pos state igniter))))

(defn can-drop-from-explosion?
  "explosion-in - `net.minecraft.world.Explosion`

  returns: `boolean`"
  (^Boolean [^BlockTNT this ^net.minecraft.world.Explosion explosion-in]
    (-> this (.canDropFromExplosion explosion-in))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockTNT this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

