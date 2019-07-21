(ns net.minecraftforge.event.brewing.PotionBrewEvent$Post
  "PotionBrewEvent.Post is fired when a potion is brewed in the brewing stand.

  The event is fired during the TileEntityBrewingStand.brewPotions() method invocation.

  PotionBrewEvent.stacks contains the itemstack array from the TileEntityBrewer holding all items in Brewer.

  This event is not Cancelable.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.brewing PotionBrewEvent$Post]))

(defn ->post
  "Constructor.

  stacks - `net.minecraft.util.NonNullList`"
  (^PotionBrewEvent$Post [^net.minecraft.util.NonNullList stacks]
    (new PotionBrewEvent$Post stacks)))

