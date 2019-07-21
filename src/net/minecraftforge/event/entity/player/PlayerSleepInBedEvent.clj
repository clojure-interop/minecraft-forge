(ns net.minecraftforge.event.entity.player.PlayerSleepInBedEvent
  "PlayerSleepInBedEvent is fired when a player sleeps in a bed.

  This event is fired whenever a player sleeps in a bed in
  EntityPlayer.trySleep(BlockPos).

  result contains whether the player is able to sleep.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerSleepInBedEvent]))

(defn ->player-sleep-in-bed-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`"
  (^PlayerSleepInBedEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (new PlayerSleepInBedEvent player pos)))

(defn get-result-status
  "returns: `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^PlayerSleepInBedEvent this]
    (-> this (.getResultStatus))))

(defn set-result
  "result - `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  ([^PlayerSleepInBedEvent this ^net.minecraft.entity.player.EntityPlayer$SleepResult result]
    (-> this (.setResult result))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^PlayerSleepInBedEvent this]
    (-> this (.getPos))))

