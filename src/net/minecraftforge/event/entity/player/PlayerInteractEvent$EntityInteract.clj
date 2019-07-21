(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
  "This event is fired on both sides when the player right clicks an entity.
  It is responsible for all general entity interactions.

  This event is fired completely independently of the above PlayerInteractEvent.EntityInteractSpecific, except for the case
  where the above call to Entity.applyPlayerInteraction(net.minecraft.entity.player.EntityPlayer, net.minecraft.util.math.Vec3d, net.minecraft.util.EnumHand) returns EnumActionResult.SUCCESS.
  In that case, general entity interactions, and hence this event, will not be called. See the above javadoc for more details.

  This event's state affects whether Entity.processInitialInteract(net.minecraft.entity.player.EntityPlayer, net.minecraft.util.EnumHand) and Item.itemInteractionForEntity(net.minecraft.item.ItemStack, net.minecraft.entity.player.EntityPlayer, net.minecraft.entity.EntityLivingBase, net.minecraft.util.EnumHand) are called.

  Canceling the event clientside will cause processing to continue to PlayerInteractEvent.RightClickItem,
  while canceling serverside will simply do no further processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$EntityInteract]))

(defn ->entity-interact
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  target - `net.minecraft.entity.Entity`"
  (^PlayerInteractEvent$EntityInteract [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand ^net.minecraft.entity.Entity target]
    (new PlayerInteractEvent$EntityInteract player hand target)))

(defn get-target
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^PlayerInteractEvent$EntityInteract this]
    (-> this (.getTarget))))

