(ns net.minecraftforge.event.entity.player.PlayerEvent$BreakSpeed
  "BreakSpeed is fired when a player attempts to harvest a block.
  This event is fired whenever a player attempts to harvest a block in
  EntityPlayer.canHarvestBlock(IBlockState).

  This event is fired via the ForgeEventFactory.getBreakSpeed(EntityPlayer, IBlockState, float, BlockPos).

  state contains the block being broken.
  originalSpeed contains the original speed at which the player broke the block.
  newSpeed contains the newSpeed at which the player will break the block.
  pos contains the coordinates at which this event is occurring. Y value -1 means location is unknown.

  This event is Cancelable.
  If it is canceled, the player is unable to break the block.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$BreakSpeed]))

(defn ->break-speed
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  state - `net.minecraft.block.state.IBlockState`
  original - `float`
  pos - `net.minecraft.util.math.BlockPos`"
  (^PlayerEvent$BreakSpeed [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState state ^Float original ^net.minecraft.util.math.BlockPos pos]
    (new PlayerEvent$BreakSpeed player state original pos)))

(defn get-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^PlayerEvent$BreakSpeed this]
    (-> this (.getState))))

(defn get-original-speed
  "returns: `float`"
  (^Float [^PlayerEvent$BreakSpeed this]
    (-> this (.getOriginalSpeed))))

(defn get-new-speed
  "returns: `float`"
  (^Float [^PlayerEvent$BreakSpeed this]
    (-> this (.getNewSpeed))))

(defn set-new-speed
  "new-speed - `float`"
  ([^PlayerEvent$BreakSpeed this ^Float new-speed]
    (-> this (.setNewSpeed new-speed))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^PlayerEvent$BreakSpeed this]
    (-> this (.getPos))))

