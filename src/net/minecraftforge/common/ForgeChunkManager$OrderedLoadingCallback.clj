(ns net.minecraftforge.common.ForgeChunkManager$OrderedLoadingCallback
  "This is a special LoadingCallback that can be implemented as well as the
  LoadingCallback to provide access to additional behaviour.
  Specifically, this callback will fire prior to Forge dropping excess
  tickets. Tickets in the returned list are presumed ordered and excess will
  be truncated from the returned list.
  This allows the mod to control not only if they actually want a ticket but
  also their preferred ticket ordering."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$OrderedLoadingCallback]))

(defn tickets-loaded
  "Called back when tickets are loaded from the world to allow the
   mod to decide if it wants the ticket still, and prioritise overflow
   based on the ticket count.
   WARNING: You cannot force chunks in this callback, it is strictly for allowing the mod
   to be more selective in which tickets it wishes to preserve in an overflow situation

  tickets - The tickets that you will want to select from. The list is immutable and cannot be manipulated directly. Copy it first. - `java.util.List`
  world - The world - `net.minecraft.world.World`
  max-ticket-count - The maximum number of tickets that will be allowed. - `int`

  returns: A list of the tickets this mod wishes to continue using. This list will be truncated
   to \"maxTicketCount\" size after the call returns and then offered to the other callback
   method - `java.util.List<net.minecraftforge.common.ForgeChunkManager$Ticket>`"
  (^java.util.List [^ForgeChunkManager$OrderedLoadingCallback this ^java.util.List tickets ^net.minecraft.world.World world ^Integer max-ticket-count]
    (-> this (.ticketsLoaded tickets world max-ticket-count))))

