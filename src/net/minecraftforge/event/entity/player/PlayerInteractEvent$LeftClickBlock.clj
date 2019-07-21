(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
  "This event is fired when a player left clicks while targeting a block.
  This event controls which of Block.onBlockClicked(net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.entity.player.EntityPlayer) and/or the item harvesting methods will be called
  Canceling the event will cause none of the above noted methods to be called.
  There are various results to this event, see the getters below.

  Note that if the event is canceled and the player holds down left mouse, the event will continue to fire.
  This is due to how vanilla calls the left click handler methods.

  Also note that creative mode directly breaks the block without running any other logic.
  Therefore, in creative mode, setUseBlock(net.minecraftforge.fml.common.eventhandler.Event.Result) and setUseItem(net.minecraftforge.fml.common.eventhandler.Event.Result) have no effect."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$LeftClickBlock]))

(defn ->left-click-block
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  face - `net.minecraft.util.EnumFacing`
  hit-vec - `net.minecraft.util.math.Vec3d`"
  (^PlayerInteractEvent$LeftClickBlock [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face ^net.minecraft.util.math.Vec3d hit-vec]
    (new PlayerInteractEvent$LeftClickBlock player pos face hit-vec)))

(defn get-hit-vec
  "returns: The local hit vector of this click - `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PlayerInteractEvent$LeftClickBlock this]
    (-> this (.getHitVec))))

(defn get-use-block
  "returns: If Block.onBlockClicked(net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.entity.player.EntityPlayer) should be called. Changing this has no effect in creative mode - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^PlayerInteractEvent$LeftClickBlock this]
    (-> this (.getUseBlock))))

(defn get-use-item
  "returns: If the block should be attempted to be mined with the current item. Changing this has no effect in creative mode - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^PlayerInteractEvent$LeftClickBlock this]
    (-> this (.getUseItem))))

(defn set-use-block
  "trigger-block - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  ([^PlayerInteractEvent$LeftClickBlock this ^net.minecraftforge.fml.common.eventhandler.Event$Result trigger-block]
    (-> this (.setUseBlock trigger-block))))

(defn set-use-item
  "trigger-item - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  ([^PlayerInteractEvent$LeftClickBlock this ^net.minecraftforge.fml.common.eventhandler.Event$Result trigger-item]
    (-> this (.setUseItem trigger-item))))

(defn set-canceled
  "Description copied from class: Event

  canceled - The new canceled value - `boolean`"
  ([^PlayerInteractEvent$LeftClickBlock this ^Boolean canceled]
    (-> this (.setCanceled canceled))))

