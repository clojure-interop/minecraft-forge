(ns net.minecraftforge.event.world.BlockEvent$BreakEvent
  "Event that is fired when an Block is about to be broken by a player
  Canceling this event will prevent the Block from being broken."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$BreakEvent]))

(defn ->break-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^BlockEvent$BreakEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player]
    (new BlockEvent$BreakEvent world pos state player)))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^BlockEvent$BreakEvent this]
    (-> this (.getPlayer))))

(defn get-exp-to-drop
  "Get the experience dropped by the block after the event has processed

  returns: The experience to drop or 0 if the event was canceled - `int`"
  (^Integer [^BlockEvent$BreakEvent this]
    (-> this (.getExpToDrop))))

(defn set-exp-to-drop
  "Set the amount of experience dropped by the block after the event has processed

  exp - 1 or higher to drop experience, else nothing will drop - `int`"
  ([^BlockEvent$BreakEvent this ^Integer exp]
    (-> this (.setExpToDrop exp))))

