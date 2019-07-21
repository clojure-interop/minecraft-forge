(ns net.minecraftforge.event.entity.player.SleepingLocationCheckEvent
  "This event is fired when game checks, if sleeping player should be still considered \"in bed\".
  Failing this check will cause player to wake up.

  This event has a result. Event.HasResult

  setResult(ALLOW) informs game that player is still \"in bed\"
  setResult(DEFAULT) causes game to check Block.isBed(IBlockState, IBlockAccess, BlockPos, Entity) instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player SleepingLocationCheckEvent]))

(defn ->sleeping-location-check-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  sleeping-location - `net.minecraft.util.math.BlockPos`"
  (^SleepingLocationCheckEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos sleeping-location]
    (new SleepingLocationCheckEvent player sleeping-location)))

(defn get-sleeping-location
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SleepingLocationCheckEvent this]
    (-> this (.getSleepingLocation))))

