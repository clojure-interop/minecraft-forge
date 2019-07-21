(ns net.minecraftforge.common.UsernameCache
  "Caches player's last known usernames

  Modders should use getLastKnownUsername(UUID) to determine a players
  last known username.
  For convenience, getMap() is provided to get an immutable copy of
  the caches underlying map."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common UsernameCache]))

(defn *get-last-known-username
  "Get the player's last known username

   May be null

  uuid - the player's UUID - `java.util.UUID`

  returns: the player's last known username, or null if the
           cache doesn't have a record of the last username - `java.lang.String`"
  (^java.lang.String [^java.util.UUID uuid]
    (UsernameCache/getLastKnownUsername uuid)))

(defn *contains-uuid
  "Check if the cache contains the given player's username

  uuid - the player's UUID - `java.util.UUID`

  returns: if the cache contains a username for the given player - `boolean`"
  (^Boolean [^java.util.UUID uuid]
    (UsernameCache/containsUUID uuid)))

(defn *get-map
  "Get an immutable copy of the cache's underlying map

  returns: the map - `java.util.Map<java.util.UUID,java.lang.String>`"
  (^java.util.Map []
    (UsernameCache/getMap )))

