(ns net.minecraftforge.event.brewing.PotionBrewEvent$Pre
  "PotionBrewEvent.Pre is fired before vanilla brewing takes place.
  All changes made to the event's array will be made to the TileEntity if the event is canceled.

  The event is fired during the TileEntityBrewingStand.brewPotions() method invocation.

  PotionBrewEvent.stacks contains the itemstack array from the TileEntityBrewer holding all items in Brewer.

  This event is Cancelable.
  If the event is not canceled, the vanilla brewing will take place instead of modded brewing.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.EVENT_BUS.

  If this event is canceled, and items have been modified, PotionBrewEvent.Post will automatically be fired."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.brewing PotionBrewEvent$Pre]))

(defn ->pre
  "Constructor.

  stacks - `net.minecraft.util.NonNullList`"
  (^PotionBrewEvent$Pre [^net.minecraft.util.NonNullList stacks]
    (new PotionBrewEvent$Pre stacks)))

