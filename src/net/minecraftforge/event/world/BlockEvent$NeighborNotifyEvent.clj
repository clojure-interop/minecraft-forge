(ns net.minecraftforge.event.world.BlockEvent$NeighborNotifyEvent
  "Fired when a physics update occurs on a block. This event acts as
  a way for mods to detect physics updates, in the same way a BUD switch
  does. This event is only called on the server."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$NeighborNotifyEvent]))

(defn ->neighbor-notify-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  notified-sides - `java.util.EnumSet`
  force-redstone-update - `boolean`"
  (^BlockEvent$NeighborNotifyEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.EnumSet notified-sides ^Boolean force-redstone-update]
    (new BlockEvent$NeighborNotifyEvent world pos state notified-sides force-redstone-update)))

(defn get-notified-sides
  "Gets a list of directions from the base block that updates will occur upon.

  returns: list of notified directions - `java.util.EnumSet<net.minecraft.util.EnumFacing>`"
  (^java.util.EnumSet [^BlockEvent$NeighborNotifyEvent this]
    (-> this (.getNotifiedSides))))

(defn get-force-redstone-update?
  "Get if redstone update was forced during setBlock call (0x16 to flags)

  returns: if the flag was set - `boolean`"
  (^Boolean [^BlockEvent$NeighborNotifyEvent this]
    (-> this (.getForceRedstoneUpdate))))

