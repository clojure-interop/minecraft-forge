(ns net.minecraft.server.management.PreYggdrasilConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PreYggdrasilConverter]))

(defn ->pre-yggdrasil-converter
  "Constructor."
  (^PreYggdrasilConverter []
    (new PreYggdrasilConverter )))

(def *-old-ipban-file
  "Static Constant.

  type: java.io.File"
  PreYggdrasilConverter/OLD_IPBAN_FILE)

(def *-old-playerban-file
  "Static Constant.

  type: java.io.File"
  PreYggdrasilConverter/OLD_PLAYERBAN_FILE)

(def *-old-ops-file
  "Static Constant.

  type: java.io.File"
  PreYggdrasilConverter/OLD_OPS_FILE)

(def *-old-whitelist-file
  "Static Constant.

  type: java.io.File"
  PreYggdrasilConverter/OLD_WHITELIST_FILE)

(defn *convert-mob-owner-if-needed
  "server - `net.minecraft.server.MinecraftServer`
  username - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.server.MinecraftServer server ^java.lang.String username]
    (PreYggdrasilConverter/convertMobOwnerIfNeeded server username)))

(defn *convert-user-banlist
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^net.minecraft.server.MinecraftServer server]
    (PreYggdrasilConverter/convertUserBanlist server)))

(defn *convert-ip-banlist
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^net.minecraft.server.MinecraftServer server]
    (PreYggdrasilConverter/convertIpBanlist server)))

(defn *convert-oplist
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^net.minecraft.server.MinecraftServer server]
    (PreYggdrasilConverter/convertOplist server)))

(defn *convert-whitelist
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^net.minecraft.server.MinecraftServer server]
    (PreYggdrasilConverter/convertWhitelist server)))

(defn *convert-save-files
  "server - `net.minecraft.server.dedicated.DedicatedServer`
  p-152723-1 - `net.minecraft.server.dedicated.PropertyManager`

  returns: `boolean`"
  (^Boolean [^net.minecraft.server.dedicated.DedicatedServer server ^net.minecraft.server.dedicated.PropertyManager p-152723-1]
    (PreYggdrasilConverter/convertSaveFiles server p-152723-1)))

(defn *try-convert
  "properties - `net.minecraft.server.dedicated.PropertyManager`

  returns: `boolean`"
  (^Boolean [^net.minecraft.server.dedicated.PropertyManager properties]
    (PreYggdrasilConverter/tryConvert properties)))

