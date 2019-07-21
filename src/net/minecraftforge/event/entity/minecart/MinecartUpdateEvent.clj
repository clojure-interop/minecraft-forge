(ns net.minecraftforge.event.entity.minecart.MinecartUpdateEvent
  "MinecartUpdateEvent is fired when a minecart is updated.
  This event is fired whenever a minecart is updated in
  EntityMinecart.onUpdate().

  pos contains the coordinate of the track the entity is on {if applicable}.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.minecart MinecartUpdateEvent]))

(defn ->minecart-update-event
  "Constructor.

  minecart - `net.minecraft.entity.item.EntityMinecart`
  pos - `net.minecraft.util.math.BlockPos`"
  (^MinecartUpdateEvent [^net.minecraft.entity.item.EntityMinecart minecart ^net.minecraft.util.math.BlockPos pos]
    (new MinecartUpdateEvent minecart pos)))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MinecartUpdateEvent this]
    (-> this (.getPos))))

