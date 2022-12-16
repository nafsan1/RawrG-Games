package com.example.core.remote

val validResponse = """
    {
        "count": 839235,
        "next": "https://api.rawg.io/api/games?key=9ef694173a0f4d1790749b6401a8ff88&page=2&page_size=10&query=gagssagasgdshgdshsdhdshds235t235236236",
        "previous": null,
        "results": [
            {
                "id": 3498,
                "slug": "grand-theft-auto-v",
                "name": "Grand Theft Auto V",
                "released": "2013-09-17",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/456/456dea5e1c7e3cd07060c14e96612001.jpg",
                "rating": 4.47,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 3614,
                        "percent": 59.11
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 2003,
                        "percent": 32.76
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 385,
                        "percent": 6.3
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 112,
                        "percent": 1.83
                    }
                ],
                "ratings_count": 6038,
                "reviews_text_count": 43,
                "added": 18338,
                "added_by_status": {
                    "yet": 465,
                    "owned": 10619,
                    "beaten": 5103,
                    "toplay": 542,
                    "dropped": 942,
                    "playing": 667
                },
                "metacritic": 91,
                "playtime": 72,
                "suggestions_count": 412,
                "updated": "2022-12-16T02:31:25",
                "user_game": null,
                "reviews_count": 6114,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": {
                            "minimum": "Minimum:OS: Windows 10 64 Bit, Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1, Windows Vista 64 Bit Service Pack 2* (*NVIDIA video card recommended if running Vista OS)Processor: Intel Core 2 Quad CPU Q6600 @ 2.40GHz (4 CPUs) / AMD Phenom 9850 Quad-Core Processor (4 CPUs) @ 2.5GHzMemory: 4 GB RAMGraphics: NVIDIA 9800 GT 1GB / AMD HD 4870 1GB (DX 10, 10.1, 11)Storage: 72 GB available spaceSound Card: 100% DirectX 10 compatibleAdditional Notes: Over time downloadable content and programming changes will change the system requirements for this game.  Please refer to your hardware manufacturer and www.rockstargames.com/support for current compatibility information. Some system components such as mobile chipsets, integrated, and AGP graphics cards may be incompatible. Unlisted specifications may not be supported by publisher.     Other requirements:  Installation and online play requires log-in to Rockstar Games Social Club (13+) network; internet connection required for activation, online play, and periodic entitlement verification; software installations required including Rockstar Games Social Club platform, DirectX , Chromium, and Microsoft Visual C++ 2008 sp1 Redistributable Package, and authentication software that recognizes certain hardware attributes for entitlement, digital rights management, system, and other support purposes.     SINGLE USE SERIAL CODE REGISTRATION VIA INTERNET REQUIRED; REGISTRATION IS LIMITED TO ONE ROCKSTAR GAMES SOCIAL CLUB ACCOUNT (13+) PER SERIAL CODE; ONLY ONE PC LOG-IN ALLOWED PER SOCIAL CLUB ACCOUNT AT ANY TIME; SERIAL CODE(S) ARE NON-TRANSFERABLE ONCE USED; SOCIAL CLUB ACCOUNTS ARE NON-TRANSFERABLE.  Partner Requirements:  Please check the terms of service of this site before purchasing this software.",
                            "recommended": "Recommended:OS: Windows 10 64 Bit, Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1Processor: Intel Core i5 3470 @ 3.2GHz (4 CPUs) / AMD X8 FX-8350 @ 4GHz (8 CPUs)Memory: 8 GB RAMGraphics: NVIDIA GTX 660 2GB / AMD HD 7870 2GBStorage: 72 GB available spaceSound Card: 100% DirectX 10 compatibleAdditional Notes:"
                        },
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 186,
                            "name": "Xbox Series S/X",
                            "slug": "xbox-series-x",
                            "image": null,
                            "year_end": null,
                            "year_start": 2020,
                            "games_count": 668,
                            "image_background": "https://media.rawg.io/media/games/1f4/1f47a270b8f241e4676b14d39ec620f7.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 18,
                            "name": "PlayStation 4",
                            "slug": "playstation4",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 6530,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 1,
                            "name": "Xbox One",
                            "slug": "xbox-one",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5443,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 187,
                            "name": "PlayStation 5",
                            "slug": "playstation5",
                            "image": null,
                            "year_end": null,
                            "year_start": 2020,
                            "games_count": 742,
                            "image_background": "https://media.rawg.io/media/games/b34/b3419c2706f8f8dbe40d08e23642ad06.jpg"
                        },
                        "released_at": "2013-09-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 3,
                        "name": "Adventure",
                        "slug": "adventure",
                        "games_count": 128587,
                        "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 290375,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 438095,
                        "store": {
                            "id": 11,
                            "name": "Epic Games",
                            "slug": "epic-games",
                            "domain": "epicgames.com",
                            "games_count": 1173,
                            "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                        }
                    },
                    {
                        "id": 290376,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 290377,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    },
                    {
                        "id": 290378,
                        "store": {
                            "id": 2,
                            "name": "Xbox Store",
                            "slug": "xbox-store",
                            "domain": "microsoft.com",
                            "games_count": 4755,
                            "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 42,
                        "name": "Great Soundtrack",
                        "slug": "great-soundtrack",
                        "language": "eng",
                        "games_count": 3221,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 18,
                        "name": "Co-op",
                        "slug": "co-op",
                        "language": "eng",
                        "games_count": 9264,
                        "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                    },
                    {
                        "id": 36,
                        "name": "Open World",
                        "slug": "open-world",
                        "language": "eng",
                        "games_count": 5803,
                        "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                    },
                    {
                        "id": 411,
                        "name": "cooperative",
                        "slug": "cooperative",
                        "language": "eng",
                        "games_count": 3753,
                        "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 149,
                        "name": "Third Person",
                        "slug": "third-person",
                        "language": "eng",
                        "games_count": 8455,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    },
                    {
                        "id": 4,
                        "name": "Funny",
                        "slug": "funny",
                        "language": "eng",
                        "games_count": 21418,
                        "image_background": "https://media.rawg.io/media/games/8cc/8cce7c0e99dcc43d66c8efd42f9d03e3.jpg"
                    },
                    {
                        "id": 37,
                        "name": "Sandbox",
                        "slug": "sandbox",
                        "language": "eng",
                        "games_count": 5554,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 123,
                        "name": "Comedy",
                        "slug": "comedy",
                        "language": "eng",
                        "games_count": 10191,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    {
                        "id": 150,
                        "name": "Third-Person Shooter",
                        "slug": "third-person-shooter",
                        "language": "eng",
                        "games_count": 2680,
                        "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                    },
                    {
                        "id": 62,
                        "name": "Moddable",
                        "slug": "moddable",
                        "language": "eng",
                        "games_count": 750,
                        "image_background": "https://media.rawg.io/media/games/149/149bbed9d90dc09328ba79bbacfda3c8.jpg"
                    },
                    {
                        "id": 144,
                        "name": "Crime",
                        "slug": "crime",
                        "language": "eng",
                        "games_count": 2421,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 62349,
                        "name": "vr mod",
                        "slug": "vr-mod",
                        "language": "eng",
                        "games_count": 17,
                        "image_background": "https://media.rawg.io/media/screenshots/1bb/1bb3f78f0fe43b5d5ca2f3da5b638840.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/456/456dea5e1c7e3cd07060c14e96612001.jpg"
                    },
                    {
                        "id": 1827221,
                        "image": "https://media.rawg.io/media/screenshots/a7c/a7c43871a54bed6573a6a429451564ef.jpg"
                    },
                    {
                        "id": 1827222,
                        "image": "https://media.rawg.io/media/screenshots/cf4/cf4367daf6a1e33684bf19adb02d16d6.jpg"
                    },
                    {
                        "id": 1827223,
                        "image": "https://media.rawg.io/media/screenshots/f95/f9518b1d99210c0cae21fc09e95b4e31.jpg"
                    },
                    {
                        "id": 1827225,
                        "image": "https://media.rawg.io/media/screenshots/a5c/a5c95ea539c87d5f538763e16e18fb99.jpg"
                    },
                    {
                        "id": 1827226,
                        "image": "https://media.rawg.io/media/screenshots/a7e/a7e990bc574f4d34e03b5926361d1ee7.jpg"
                    },
                    {
                        "id": 1827227,
                        "image": "https://media.rawg.io/media/screenshots/592/592e2501d8734b802b2a34fee2df59fa.jpg"
                    }
                ]
            },
            {
                "id": 3328,
                "slug": "the-witcher-3-wild-hunt",
                "name": "The Witcher 3: Wild Hunt",
                "released": "2015-05-18",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg",
                "rating": 4.67,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 4493,
                        "percent": 77.99
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 899,
                        "percent": 15.6
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 230,
                        "percent": 3.99
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 139,
                        "percent": 2.41
                    }
                ],
                "ratings_count": 5680,
                "reviews_text_count": 58,
                "added": 17265,
                "added_by_status": {
                    "yet": 979,
                    "owned": 9891,
                    "beaten": 4121,
                    "toplay": 694,
                    "dropped": 780,
                    "playing": 800
                },
                "metacritic": 92,
                "playtime": 46,
                "suggestions_count": 659,
                "updated": "2022-12-16T02:30:59",
                "user_game": null,
                "reviews_count": 5761,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 186,
                            "name": "Xbox Series S/X",
                            "slug": "xbox-series-x",
                            "image": null,
                            "year_end": null,
                            "year_start": 2020,
                            "games_count": 668,
                            "image_background": "https://media.rawg.io/media/games/1f4/1f47a270b8f241e4676b14d39ec620f7.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 18,
                            "name": "PlayStation 4",
                            "slug": "playstation4",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 6530,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo Switch",
                            "slug": "nintendo-switch",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5087,
                            "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 1,
                            "name": "Xbox One",
                            "slug": "xbox-one",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5443,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 187,
                            "name": "PlayStation 5",
                            "slug": "playstation5",
                            "image": null,
                            "year_end": null,
                            "year_start": 2020,
                            "games_count": 742,
                            "image_background": "https://media.rawg.io/media/games/b34/b3419c2706f8f8dbe40d08e23642ad06.jpg"
                        },
                        "released_at": "2015-05-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo",
                            "slug": "nintendo"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 3,
                        "name": "Adventure",
                        "slug": "adventure",
                        "games_count": 128587,
                        "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                    },
                    {
                        "id": 5,
                        "name": "RPG",
                        "slug": "role-playing-games-rpg",
                        "games_count": 51116,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 354780,
                        "store": {
                            "id": 5,
                            "name": "GOG",
                            "slug": "gog",
                            "domain": "gog.com",
                            "games_count": 4585,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        }
                    },
                    {
                        "id": 3565,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 305376,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 312313,
                        "store": {
                            "id": 2,
                            "name": "Xbox Store",
                            "slug": "xbox-store",
                            "domain": "microsoft.com",
                            "games_count": 4755,
                            "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                        }
                    },
                    {
                        "id": 676022,
                        "store": {
                            "id": 6,
                            "name": "Nintendo Store",
                            "slug": "nintendo",
                            "domain": "nintendo.com",
                            "games_count": 8878,
                            "image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 42,
                        "name": "Great Soundtrack",
                        "slug": "great-soundtrack",
                        "language": "eng",
                        "games_count": 3221,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 118,
                        "name": "Story Rich",
                        "slug": "story-rich",
                        "language": "eng",
                        "games_count": 16869,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 36,
                        "name": "Open World",
                        "slug": "open-world",
                        "language": "eng",
                        "games_count": 5803,
                        "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                    },
                    {
                        "id": 149,
                        "name": "Third Person",
                        "slug": "third-person",
                        "language": "eng",
                        "games_count": 8455,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    },
                    {
                        "id": 64,
                        "name": "Fantasy",
                        "slug": "fantasy",
                        "language": "eng",
                        "games_count": 22740,
                        "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                    },
                    {
                        "id": 37,
                        "name": "Sandbox",
                        "slug": "sandbox",
                        "language": "eng",
                        "games_count": 5554,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 97,
                        "name": "Action RPG",
                        "slug": "action-rpg",
                        "language": "eng",
                        "games_count": 5411,
                        "image_background": "https://media.rawg.io/media/games/f99/f9979698c43fd84c3ab69280576dd3af.jpg"
                    },
                    {
                        "id": 41,
                        "name": "Dark",
                        "slug": "dark",
                        "language": "eng",
                        "games_count": 12950,
                        "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                    },
                    {
                        "id": 44,
                        "name": "Nudity",
                        "slug": "nudity",
                        "language": "eng",
                        "games_count": 4294,
                        "image_background": "https://media.rawg.io/media/games/a0e/a0ef08621301a1eab5e04fa5c96978fa.jpeg"
                    },
                    {
                        "id": 336,
                        "name": "controller support",
                        "slug": "controller-support",
                        "language": "eng",
                        "games_count": 293,
                        "image_background": "https://media.rawg.io/media/games/c81/c812e158129e00c9b0f096ae8a0bb7d6.jpg"
                    },
                    {
                        "id": 145,
                        "name": "Choices Matter",
                        "slug": "choices-matter",
                        "language": "eng",
                        "games_count": 2892,
                        "image_background": "https://media.rawg.io/media/games/260/26023c855f1769a93411d6a7ea084632.jpeg"
                    },
                    {
                        "id": 192,
                        "name": "Mature",
                        "slug": "mature",
                        "language": "eng",
                        "games_count": 1768,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    {
                        "id": 40,
                        "name": "Dark Fantasy",
                        "slug": "dark-fantasy",
                        "language": "eng",
                        "games_count": 2917,
                        "image_background": "https://media.rawg.io/media/games/1dc/1dc45435c09f844b24eb96cd66eb6325.jpg"
                    },
                    {
                        "id": 66,
                        "name": "Medieval",
                        "slug": "medieval",
                        "language": "eng",
                        "games_count": 4871,
                        "image_background": "https://media.rawg.io/media/games/155/155a7d8f464ef6029e11cc6a9c0f763d.jpg"
                    },
                    {
                        "id": 82,
                        "name": "Magic",
                        "slug": "magic",
                        "language": "eng",
                        "games_count": 7562,
                        "image_background": "https://media.rawg.io/media/games/b17/b175178f8842276b8b18b339fe3146a1.jpg"
                    },
                    {
                        "id": 218,
                        "name": "Multiple Endings",
                        "slug": "multiple-endings",
                        "language": "eng",
                        "games_count": 6309,
                        "image_background": "https://media.rawg.io/media/games/1aa/1aaf454e0d3809ba1c34df4514492237.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 30336,
                        "image": "https://media.rawg.io/media/screenshots/1ac/1ac19f31974314855ad7be266adeb500.jpg"
                    },
                    {
                        "id": 30337,
                        "image": "https://media.rawg.io/media/screenshots/6a0/6a08afca95261a2fe221ea9e01d28762.jpg"
                    },
                    {
                        "id": 30338,
                        "image": "https://media.rawg.io/media/screenshots/cdd/cdd31b6b4a687425a87b5ce231ac89d7.jpg"
                    },
                    {
                        "id": 30339,
                        "image": "https://media.rawg.io/media/screenshots/862/862397b153221a625922d3bb66337834.jpg"
                    },
                    {
                        "id": 30340,
                        "image": "https://media.rawg.io/media/screenshots/166/166787c442a45f52f4f230c33fd7d605.jpg"
                    },
                    {
                        "id": 30342,
                        "image": "https://media.rawg.io/media/screenshots/f63/f6373ee614046d81503d63f167181803.jpg"
                    }
                ]
            },
            {
                "id": 4200,
                "slug": "portal-2",
                "name": "Portal 2",
                "released": "2011-04-18",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg",
                "rating": 4.62,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 3557,
                        "percent": 70.44
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1253,
                        "percent": 24.81
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 138,
                        "percent": 2.73
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 102,
                        "percent": 2.02
                    }
                ],
                "ratings_count": 5008,
                "reviews_text_count": 29,
                "added": 16232,
                "added_by_status": {
                    "yet": 539,
                    "owned": 9951,
                    "beaten": 4798,
                    "toplay": 313,
                    "dropped": 500,
                    "playing": 131
                },
                "metacritic": 95,
                "playtime": 11,
                "suggestions_count": 540,
                "updated": "2022-12-15T23:59:51",
                "user_game": null,
                "reviews_count": 5050,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2011-04-19",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 74810,
                            "image_background": "https://media.rawg.io/media/games/b54/b54598d1d5cc31899f4f0a7e3122a7b0.jpg"
                        },
                        "released_at": "2011-04-19",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "macOS",
                            "slug": "macos",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 101428,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": null,
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2011-04-19",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": null,
                        "requirements_en": null,
                        "requirements_ru": {
                            "minimum": "Core 2 Duo/Athlon X2 2 ГГц,1 Гб памяти,GeForce 7600/Radeon X800,10 Гб на винчестере,интернет-соединение",
                            "recommended": "Core 2 Duo/Athlon X2 2.5 ГГц,2 Гб памяти,GeForce GTX 280/Radeon HD 2600,10 Гб на винчестере,интернет-соединение"
                        }
                    },
                    {
                        "platform": {
                            "id": 1,
                            "name": "Xbox One",
                            "slug": "xbox-one",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5443,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        },
                        "released_at": "2011-04-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "Apple Macintosh",
                            "slug": "mac"
                        }
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 2,
                        "name": "Shooter",
                        "slug": "shooter",
                        "games_count": 59038,
                        "image_background": "https://media.rawg.io/media/games/be0/be01c3d7d8795a45615da139322ca080.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Puzzle",
                        "slug": "puzzle",
                        "games_count": 95053,
                        "image_background": "https://media.rawg.io/media/games/2e1/2e187b31e5cee21c110bd16798d75fab.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 465889,
                        "store": {
                            "id": 2,
                            "name": "Xbox Store",
                            "slug": "xbox-store",
                            "domain": "microsoft.com",
                            "games_count": 4755,
                            "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                        }
                    },
                    {
                        "id": 13134,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 4526,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 33916,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 40849,
                        "name": "Steam Cloud",
                        "slug": "steam-cloud",
                        "language": "eng",
                        "games_count": 12911,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 18,
                        "name": "Co-op",
                        "slug": "co-op",
                        "language": "eng",
                        "games_count": 9264,
                        "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                    },
                    {
                        "id": 118,
                        "name": "Story Rich",
                        "slug": "story-rich",
                        "language": "eng",
                        "games_count": 16869,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 411,
                        "name": "cooperative",
                        "slug": "cooperative",
                        "language": "eng",
                        "games_count": 3753,
                        "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 32,
                        "name": "Sci-fi",
                        "slug": "sci-fi",
                        "language": "eng",
                        "games_count": 16264,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 9,
                        "name": "Online Co-Op",
                        "slug": "online-co-op",
                        "language": "eng",
                        "games_count": 3980,
                        "image_background": "https://media.rawg.io/media/games/476/476178ef18ab0534771d099f51cdc694.jpg"
                    },
                    {
                        "id": 4,
                        "name": "Funny",
                        "slug": "funny",
                        "language": "eng",
                        "games_count": 21418,
                        "image_background": "https://media.rawg.io/media/games/8cc/8cce7c0e99dcc43d66c8efd42f9d03e3.jpg"
                    },
                    {
                        "id": 189,
                        "name": "Female Protagonist",
                        "slug": "female-protagonist",
                        "language": "eng",
                        "games_count": 9659,
                        "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                    },
                    {
                        "id": 123,
                        "name": "Comedy",
                        "slug": "comedy",
                        "language": "eng",
                        "games_count": 10191,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    {
                        "id": 75,
                        "name": "Local Co-Op",
                        "slug": "local-co-op",
                        "language": "eng",
                        "games_count": 4793,
                        "image_background": "https://media.rawg.io/media/games/27b/27b02ffaab6b250cc31bf43baca1fc34.jpg"
                    },
                    {
                        "id": 11669,
                        "name": "stats",
                        "slug": "stats",
                        "language": "eng",
                        "games_count": 4322,
                        "image_background": "https://media.rawg.io/media/games/0bd/0bd5646a3d8ee0ac3314bced91ea306d.jpg"
                    },
                    {
                        "id": 40852,
                        "name": "Steam Workshop",
                        "slug": "steam-workshop",
                        "language": "eng",
                        "games_count": 1248,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 25,
                        "name": "Space",
                        "slug": "space",
                        "language": "eng",
                        "games_count": 40768,
                        "image_background": "https://media.rawg.io/media/games/a6c/a6ccd34125c594abf1a9c9821b9a715d.jpg"
                    },
                    {
                        "id": 40838,
                        "name": "Includes level editor",
                        "slug": "includes-level-editor",
                        "language": "eng",
                        "games_count": 1565,
                        "image_background": "https://media.rawg.io/media/games/58a/58ac7f6569259dcc0b60b921869b19fc.jpg"
                    },
                    {
                        "id": 40833,
                        "name": "Captions available",
                        "slug": "captions-available",
                        "language": "eng",
                        "games_count": 1206,
                        "image_background": "https://media.rawg.io/media/games/c2e/c2eb6021a2596644b437e943612af25c.jpg"
                    },
                    {
                        "id": 40834,
                        "name": "Commentary available",
                        "slug": "commentary-available",
                        "language": "eng",
                        "games_count": 249,
                        "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                    },
                    {
                        "id": 87,
                        "name": "Science",
                        "slug": "science",
                        "language": "eng",
                        "games_count": 1440,
                        "image_background": "https://media.rawg.io/media/games/174/1743b3dd185bda4a7be349347d4064df.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 2,
                    "name": "Everyone 10+",
                    "slug": "everyone-10-plus"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg"
                    },
                    {
                        "id": 99018,
                        "image": "https://media.rawg.io/media/screenshots/221/221a03c11e5ff9f765d62f60d4b4cbf5.jpg"
                    },
                    {
                        "id": 99019,
                        "image": "https://media.rawg.io/media/screenshots/173/1737ff43c14f40294011a209b1012875.jpg"
                    },
                    {
                        "id": 99020,
                        "image": "https://media.rawg.io/media/screenshots/b11/b11a2ae0664f0e8a1ef2346f99df26e1.jpg"
                    },
                    {
                        "id": 99021,
                        "image": "https://media.rawg.io/media/screenshots/9b1/9b107a790909b31918ebe2f40547cc85.jpg"
                    },
                    {
                        "id": 99022,
                        "image": "https://media.rawg.io/media/screenshots/d05/d058fc7f7fa6128916c311eb14267fed.jpg"
                    },
                    {
                        "id": 99023,
                        "image": "https://media.rawg.io/media/screenshots/415/41543dcc12dffc8e97d85a56ad42cda8.jpg"
                    }
                ]
            },
            {
                "id": 5286,
                "slug": "tomb-raider",
                "name": "Tomb Raider (2013)",
                "released": "2013-03-05",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg",
                "rating": 4.05,
                "rating_top": 4,
                "ratings": [
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 2135,
                        "percent": 60.45
                    },
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 896,
                        "percent": 25.37
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 396,
                        "percent": 11.21
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 105,
                        "percent": 2.97
                    }
                ],
                "ratings_count": 3509,
                "reviews_text_count": 10,
                "added": 14319,
                "added_by_status": {
                    "yet": 575,
                    "owned": 9247,
                    "beaten": 3717,
                    "toplay": 223,
                    "dropped": 456,
                    "playing": 101
                },
                "metacritic": 86,
                "playtime": 11,
                "suggestions_count": 628,
                "updated": "2022-12-14T14:42:40",
                "user_game": null,
                "reviews_count": 3532,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 18,
                            "name": "PlayStation 4",
                            "slug": "playstation4",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 6530,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "macOS",
                            "slug": "macos",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 101428,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": {
                            "minimum": "Minimum:\r\n\r\nOS: macOS 10.9.1\r\n\r\nProcessor: 2.0GHz Intel or greater\r\n\r\nMemory: 4GB\r\n\r\nGraphics: 512Mb AMD 4850, 512Mb Nvidia 650M, Intel HD4000\r\n\r\nHard Drive: 14GB"
                        },
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong>Windows XP / Windows Vista / Windows 7<br>\t</li><li><strong>Processor:</strong>1.8 GHz Processor<br>\t</li><li><strong>Memory:</strong>512 MB RAM<br>\t</li><li><strong>Graphics:</strong>3D graphics card compatible with DirectX 9<br>\t</li><li><strong>DirectX®:</strong>9.0<br>\t</li><li><strong>Hard Drive:</strong>2 GB HD space</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "i486-100, 8 Мб",
                            "recommended": "Pentium 166, 16 Мб"
                        }
                    },
                    {
                        "platform": {
                            "id": 1,
                            "name": "Xbox One",
                            "slug": "xbox-one",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5443,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2013-03-05",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "Apple Macintosh",
                            "slug": "mac"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 3,
                        "name": "Adventure",
                        "slug": "adventure",
                        "games_count": 128587,
                        "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 33824,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    },
                    {
                        "id": 13151,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 5640,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 218233,
                        "store": {
                            "id": 8,
                            "name": "Google Play",
                            "slug": "google-play",
                            "domain": "play.google.com",
                            "games_count": 16933,
                            "image_background": "https://media.rawg.io/media/games/d4b/d4bcd78873edd9992d93aff9cc8db0c8.jpg"
                        }
                    },
                    {
                        "id": 79036,
                        "store": {
                            "id": 4,
                            "name": "App Store",
                            "slug": "apple-appstore",
                            "domain": "apps.apple.com",
                            "games_count": 74250,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        }
                    },
                    {
                        "id": 713685,
                        "store": {
                            "id": 11,
                            "name": "Epic Games",
                            "slug": "epic-games",
                            "domain": "epicgames.com",
                            "games_count": 1173,
                            "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 149,
                        "name": "Third Person",
                        "slug": "third-person",
                        "language": "eng",
                        "games_count": 8455,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    },
                    {
                        "id": 193,
                        "name": "Classic",
                        "slug": "classic",
                        "language": "eng",
                        "games_count": 1731,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 6,
                        "name": "Exploration",
                        "slug": "exploration",
                        "language": "eng",
                        "games_count": 17860,
                        "image_background": "https://media.rawg.io/media/games/f46/f466571d536f2e3ea9e815ad17177501.jpg"
                    },
                    {
                        "id": 189,
                        "name": "Female Protagonist",
                        "slug": "female-protagonist",
                        "language": "eng",
                        "games_count": 9659,
                        "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                    },
                    {
                        "id": 15,
                        "name": "Stealth",
                        "slug": "stealth",
                        "language": "eng",
                        "games_count": 5469,
                        "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                    },
                    {
                        "id": 150,
                        "name": "Third-Person Shooter",
                        "slug": "third-person-shooter",
                        "language": "eng",
                        "games_count": 2680,
                        "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                    },
                    {
                        "id": 69,
                        "name": "Action-Adventure",
                        "slug": "action-adventure",
                        "language": "eng",
                        "games_count": 12691,
                        "image_background": "https://media.rawg.io/media/games/d30/d30ef0c7dd4878161b1f781e297ae6a0.jpg"
                    },
                    {
                        "id": 74,
                        "name": "Retro",
                        "slug": "retro",
                        "language": "eng",
                        "games_count": 37435,
                        "image_background": "https://media.rawg.io/media/games/ffe/ffed87105b14f5beff72ff44a7793fd5.jpg"
                    },
                    {
                        "id": 110,
                        "name": "Cinematic",
                        "slug": "cinematic",
                        "language": "eng",
                        "games_count": 1160,
                        "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                    },
                    {
                        "id": 269,
                        "name": "Quick-Time Events",
                        "slug": "quick-time-events",
                        "language": "eng",
                        "games_count": 336,
                        "image_background": "https://media.rawg.io/media/games/7a5/7a5f7a3e58593bfda983507c2ddbc891.jpg"
                    },
                    {
                        "id": 126,
                        "name": "Dinosaurs",
                        "slug": "dinosaurs",
                        "language": "eng",
                        "games_count": 1574,
                        "image_background": "https://media.rawg.io/media/screenshots/dbb/dbbedafecf59e1f1f19464f0d2033eba.jpg"
                    },
                    {
                        "id": 306,
                        "name": "Lara Croft",
                        "slug": "lara-croft",
                        "language": "eng",
                        "games_count": 14,
                        "image_background": "https://media.rawg.io/media/games/e6b/e6b025951f9a72673f41c0588fb85758.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 99160,
                        "image": "https://media.rawg.io/media/screenshots/4f9/4f9d5efdecfb63cb99f1baa4c0ceb3bf.jpg"
                    },
                    {
                        "id": 99161,
                        "image": "https://media.rawg.io/media/screenshots/80f/80f373082b2a74da3f9c3fe2b877dcd0.jpg"
                    },
                    {
                        "id": 99162,
                        "image": "https://media.rawg.io/media/screenshots/a87/a8733e877f8fbe45e4a727c22a06aa2e.jpg"
                    },
                    {
                        "id": 99163,
                        "image": "https://media.rawg.io/media/screenshots/3f9/3f91678c6805a76419fa4ea3a045a909.jpg"
                    },
                    {
                        "id": 99164,
                        "image": "https://media.rawg.io/media/screenshots/417/4170bf07be43a8d8249193883f87f1c1.jpg"
                    },
                    {
                        "id": 99165,
                        "image": "https://media.rawg.io/media/screenshots/2a4/2a4250f83ad9e959d8b4ca9376ae34ea.jpg"
                    }
                ]
            },
            {
                "id": 4291,
                "slug": "counter-strike-global-offensive",
                "name": "Counter-Strike: Global Offensive",
                "released": "2012-08-21",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg",
                "rating": 3.57,
                "rating_top": 4,
                "ratings": [
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1454,
                        "percent": 46.93
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 806,
                        "percent": 26.02
                    },
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 498,
                        "percent": 16.07
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 340,
                        "percent": 10.97
                    }
                ],
                "ratings_count": 3072,
                "reviews_text_count": 20,
                "added": 13982,
                "added_by_status": {
                    "yet": 224,
                    "owned": 10569,
                    "beaten": 854,
                    "toplay": 67,
                    "dropped": 1678,
                    "playing": 590
                },
                "metacritic": 81,
                "playtime": 64,
                "suggestions_count": 577,
                "updated": "2022-12-16T02:34:07",
                "user_game": null,
                "reviews_count": 3098,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2012-08-21",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7/Vista/XP<br></li><li><strong>Processor:</strong> Intel® Core™ 2 Duo E6600 or AMD Phenom™ X3 8750 processor or better<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video card must be 256 MB or more and should be a DirectX 9-compatible with support for Pixel Shader 3.0<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 15 GB available space</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "Сore 2 Duo/Athlon x2 64 1.8 ГГц,2 Гб памяти,GeForce 8800/Radeon X9800,7.6 Гб на винчестере,интернет-соединение",
                            "recommended": "Core 2 Duo E6600/Phenom X3 8750,4 Гб памяти,GeForce 480 GTX/Radeon HD 6970,7.6 Гб на винчестере,интернет-соединение"
                        }
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2012-08-21",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2012-08-21",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 2,
                        "name": "Shooter",
                        "slug": "shooter",
                        "games_count": 59038,
                        "image_background": "https://media.rawg.io/media/games/be0/be01c3d7d8795a45615da139322ca080.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 4619,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 11489,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 49169,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 18,
                        "name": "Co-op",
                        "slug": "co-op",
                        "language": "eng",
                        "games_count": 9264,
                        "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                    },
                    {
                        "id": 411,
                        "name": "cooperative",
                        "slug": "cooperative",
                        "language": "eng",
                        "games_count": 3753,
                        "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 9,
                        "name": "Online Co-Op",
                        "slug": "online-co-op",
                        "language": "eng",
                        "games_count": 3980,
                        "image_background": "https://media.rawg.io/media/games/476/476178ef18ab0534771d099f51cdc694.jpg"
                    },
                    {
                        "id": 80,
                        "name": "Tactical",
                        "slug": "tactical",
                        "language": "eng",
                        "games_count": 3741,
                        "image_background": "https://media.rawg.io/media/games/59f/59fc1c5de1d29cb9234741c97d250150.jpg"
                    },
                    {
                        "id": 11669,
                        "name": "stats",
                        "slug": "stats",
                        "language": "eng",
                        "games_count": 4322,
                        "image_background": "https://media.rawg.io/media/games/0bd/0bd5646a3d8ee0ac3314bced91ea306d.jpg"
                    },
                    {
                        "id": 40852,
                        "name": "Steam Workshop",
                        "slug": "steam-workshop",
                        "language": "eng",
                        "games_count": 1248,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 62,
                        "name": "Moddable",
                        "slug": "moddable",
                        "language": "eng",
                        "games_count": 750,
                        "image_background": "https://media.rawg.io/media/games/149/149bbed9d90dc09328ba79bbacfda3c8.jpg"
                    },
                    {
                        "id": 157,
                        "name": "PvP",
                        "slug": "pvp",
                        "language": "eng",
                        "games_count": 6505,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 70,
                        "name": "War",
                        "slug": "war",
                        "language": "eng",
                        "games_count": 8426,
                        "image_background": "https://media.rawg.io/media/games/0fa/0fadc446fd1e9ae9e23a32793d9a5406.jpg"
                    },
                    {
                        "id": 40837,
                        "name": "In-App Purchases",
                        "slug": "in-app-purchases",
                        "language": "eng",
                        "games_count": 1889,
                        "image_background": "https://media.rawg.io/media/games/e74/e74458058b35e01c1ae3feeb39a3f724.jpg"
                    },
                    {
                        "id": 11,
                        "name": "Team-Based",
                        "slug": "team-based",
                        "language": "eng",
                        "games_count": 1191,
                        "image_background": "https://media.rawg.io/media/games/c7a/c7a71a0531a9518236d99d0d60abe447.jpg"
                    },
                    {
                        "id": 77,
                        "name": "Realistic",
                        "slug": "realistic",
                        "language": "eng",
                        "games_count": 3191,
                        "image_background": "https://media.rawg.io/media/games/27b/27b02ffaab6b250cc31bf43baca1fc34.jpg"
                    },
                    {
                        "id": 131,
                        "name": "Fast-Paced",
                        "slug": "fast-paced",
                        "language": "eng",
                        "games_count": 10156,
                        "image_background": "https://media.rawg.io/media/games/8e6/8e699e91cf77c2060b6d515e2135b1b1.jpg"
                    },
                    {
                        "id": 81,
                        "name": "Military",
                        "slug": "military",
                        "language": "eng",
                        "games_count": 1197,
                        "image_background": "https://media.rawg.io/media/games/106/1069e754e7e6012b0cf42b4b04704792.jpg"
                    },
                    {
                        "id": 170,
                        "name": "Competitive",
                        "slug": "competitive",
                        "language": "eng",
                        "games_count": 968,
                        "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                    },
                    {
                        "id": 40856,
                        "name": "Valve Anti-Cheat enabled",
                        "slug": "valve-anti-cheat-enabled",
                        "language": "eng",
                        "games_count": 104,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 73,
                        "name": "e-sports",
                        "slug": "e-sports",
                        "language": "eng",
                        "games_count": 80,
                        "image_background": "https://media.rawg.io/media/games/cc7/cc77035eb972f179f5090ee2a0fabd99.jpg"
                    },
                    {
                        "id": 245,
                        "name": "Trading",
                        "slug": "trading",
                        "language": "eng",
                        "games_count": 939,
                        "image_background": "https://media.rawg.io/media/screenshots/da8/da840a45bceef305e577525e31c2a6c4_uIQGg3p.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 81644,
                        "image": "https://media.rawg.io/media/screenshots/ff1/ff16661bb15f7969b44f6c4118870e44.jpg"
                    },
                    {
                        "id": 81645,
                        "image": "https://media.rawg.io/media/screenshots/41b/41bb769d247412eac3336dec934aed72.jpg"
                    },
                    {
                        "id": 81646,
                        "image": "https://media.rawg.io/media/screenshots/754/754545acdbf71f56e8902a07c7d20696.jpg"
                    },
                    {
                        "id": 81647,
                        "image": "https://media.rawg.io/media/screenshots/fd8/fd873cab4c66db0b8e85d8a66e940074.jpg"
                    },
                    {
                        "id": 81648,
                        "image": "https://media.rawg.io/media/screenshots/7db/7db2954f7908b6749c36a5f3c9052f65.jpg"
                    },
                    {
                        "id": 81649,
                        "image": "https://media.rawg.io/media/screenshots/337/337a3e98b5933f456a2b37b59fab5f39.jpg"
                    }
                ]
            },
            {
                "id": 5679,
                "slug": "the-elder-scrolls-v-skyrim",
                "name": "The Elder Scrolls V: Skyrim",
                "released": "2011-11-11",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg",
                "rating": 4.42,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 2398,
                        "percent": 57.3
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1326,
                        "percent": 31.68
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 372,
                        "percent": 8.89
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 89,
                        "percent": 2.13
                    }
                ],
                "ratings_count": 4150,
                "reviews_text_count": 24,
                "added": 13880,
                "added_by_status": {
                    "yet": 443,
                    "owned": 8300,
                    "beaten": 3303,
                    "toplay": 347,
                    "dropped": 1135,
                    "playing": 352
                },
                "metacritic": 94,
                "playtime": 46,
                "suggestions_count": 585,
                "updated": "2022-12-16T02:34:22",
                "user_game": null,
                "reviews_count": 4185,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2011-11-11",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br>\t\t\t\t\t\t\t\t<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/Vista/XP PC (32 or 64 bit)<br>\t\t\t\t\t\t\t\t</li><li><strong>Processor:</strong> Dual Core 2.0GHz or equivalent processor<br>\t\t\t\t\t\t\t\t</li><li><strong>Memory:</strong> 2GB System RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Hard Disk Space:</strong> 6GB free HDD Space<br>\t\t\t\t\t\t\t\t</li><li><strong>Video Card:</strong> Direct X 9.0c compliant video card with 512 MB of RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Sound:</strong> DirectX compatible sound card<br>\t\t\t\t\t\t\t\t</li></ul>",
                            "recommended": "<strong>Recommended:</strong><br>\t\t\t\t\t\t\t\t<ul class=\"bb_ul\"><li><strong>Processor:</strong> Quad-core Intel or AMD CPU<br>\t\t\t\t\t\t\t\t</li><li><strong>Memory:</strong> 4GB System RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Video Card:</strong> DirectX 9.0c compatible NVIDIA or AMD ATI video card with 1GB of RAM (Nvidia GeForce GTX 260 or higher; ATI Radeon 4890 or higher)<br>\t\t\t\t\t\t\t\t</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "Core 2 Duo/Athlon X2 2 ГГц,2 Гб памяти,GeForce 8800/Radeon X1900,6 Гб на винчестере",
                            "recommended": "Core 2 Quad/Phenom X4 2.5 ГГц,4 Гб памяти,GeForce GTX 260/Radeon HD 4890,6 Гб на винчестере"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo Switch",
                            "slug": "nintendo-switch",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5087,
                            "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                        },
                        "released_at": "2011-11-11",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2011-11-11",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2011-11-11",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo",
                            "slug": "nintendo"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 5,
                        "name": "RPG",
                        "slug": "role-playing-games-rpg",
                        "games_count": 51116,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 6037,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 15144,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 32919,
                        "store": {
                            "id": 6,
                            "name": "Nintendo Store",
                            "slug": "nintendo",
                            "domain": "nintendo.com",
                            "games_count": 8878,
                            "image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
                        }
                    },
                    {
                        "id": 49792,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40849,
                        "name": "Steam Cloud",
                        "slug": "steam-cloud",
                        "language": "eng",
                        "games_count": 12911,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 42,
                        "name": "Great Soundtrack",
                        "slug": "great-soundtrack",
                        "language": "eng",
                        "games_count": 3221,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 118,
                        "name": "Story Rich",
                        "slug": "story-rich",
                        "language": "eng",
                        "games_count": 16869,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 36,
                        "name": "Open World",
                        "slug": "open-world",
                        "language": "eng",
                        "games_count": 5803,
                        "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 149,
                        "name": "Third Person",
                        "slug": "third-person",
                        "language": "eng",
                        "games_count": 8455,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    },
                    {
                        "id": 40845,
                        "name": "Partial Controller Support",
                        "slug": "partial-controller-support",
                        "language": "eng",
                        "games_count": 9095,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 64,
                        "name": "Fantasy",
                        "slug": "fantasy",
                        "language": "eng",
                        "games_count": 22740,
                        "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                    },
                    {
                        "id": 37,
                        "name": "Sandbox",
                        "slug": "sandbox",
                        "language": "eng",
                        "games_count": 5554,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 97,
                        "name": "Action RPG",
                        "slug": "action-rpg",
                        "language": "eng",
                        "games_count": 5411,
                        "image_background": "https://media.rawg.io/media/games/f99/f9979698c43fd84c3ab69280576dd3af.jpg"
                    },
                    {
                        "id": 40852,
                        "name": "Steam Workshop",
                        "slug": "steam-workshop",
                        "language": "eng",
                        "games_count": 1248,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 468,
                        "name": "role-playing",
                        "slug": "role-playing",
                        "language": "eng",
                        "games_count": 1401,
                        "image_background": "https://media.rawg.io/media/games/9f1/9f1891779cb20f44de93cef33b067e50.jpg"
                    },
                    {
                        "id": 62,
                        "name": "Moddable",
                        "slug": "moddable",
                        "language": "eng",
                        "games_count": 750,
                        "image_background": "https://media.rawg.io/media/games/149/149bbed9d90dc09328ba79bbacfda3c8.jpg"
                    },
                    {
                        "id": 121,
                        "name": "Character Customization",
                        "slug": "character-customization",
                        "language": "eng",
                        "games_count": 3062,
                        "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                    },
                    {
                        "id": 40,
                        "name": "Dark Fantasy",
                        "slug": "dark-fantasy",
                        "language": "eng",
                        "games_count": 2917,
                        "image_background": "https://media.rawg.io/media/games/1dc/1dc45435c09f844b24eb96cd66eb6325.jpg"
                    },
                    {
                        "id": 66,
                        "name": "Medieval",
                        "slug": "medieval",
                        "language": "eng",
                        "games_count": 4871,
                        "image_background": "https://media.rawg.io/media/games/155/155a7d8f464ef6029e11cc6a9c0f763d.jpg"
                    },
                    {
                        "id": 82,
                        "name": "Magic",
                        "slug": "magic",
                        "language": "eng",
                        "games_count": 7562,
                        "image_background": "https://media.rawg.io/media/games/b17/b175178f8842276b8b18b339fe3146a1.jpg"
                    },
                    {
                        "id": 205,
                        "name": "Lore-Rich",
                        "slug": "lore-rich",
                        "language": "eng",
                        "games_count": 626,
                        "image_background": "https://media.rawg.io/media/screenshots/aca/aca80d402fcf64ea31d63cafe14cc6d2.jpg"
                    },
                    {
                        "id": 215,
                        "name": "Dragons",
                        "slug": "dragons",
                        "language": "eng",
                        "games_count": 2324,
                        "image_background": "https://media.rawg.io/media/games/260/26023c855f1769a93411d6a7ea084632.jpeg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 118307,
                        "image": "https://media.rawg.io/media/screenshots/3bd/3bd2710bd1ffb6664fdea7b83afd067e.jpg"
                    },
                    {
                        "id": 118308,
                        "image": "https://media.rawg.io/media/screenshots/d4e/d4e9b13f54748584ccbd6f998094dade.jpg"
                    },
                    {
                        "id": 118309,
                        "image": "https://media.rawg.io/media/screenshots/599/59946a630e9c7871003763d63184404a.jpg"
                    },
                    {
                        "id": 118310,
                        "image": "https://media.rawg.io/media/screenshots/c5d/c5dad426038d7d12f933eedbeab48ff3.jpg"
                    },
                    {
                        "id": 118311,
                        "image": "https://media.rawg.io/media/screenshots/b32/b326fa01c82db82edd41ed299886ee44.jpg"
                    },
                    {
                        "id": 118312,
                        "image": "https://media.rawg.io/media/screenshots/091/091e95b49d5a22de036698fc731395a2.jpg"
                    }
                ]
            },
            {
                "id": 13536,
                "slug": "portal",
                "name": "Portal",
                "released": "2007-10-09",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg",
                "rating": 4.51,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 2573,
                        "percent": 61.16
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1385,
                        "percent": 32.92
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 166,
                        "percent": 3.95
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 83,
                        "percent": 1.97
                    }
                ],
                "ratings_count": 4176,
                "reviews_text_count": 22,
                "added": 13773,
                "added_by_status": {
                    "yet": 382,
                    "owned": 8465,
                    "beaten": 4332,
                    "toplay": 209,
                    "dropped": 320,
                    "playing": 65
                },
                "metacritic": 90,
                "playtime": 4,
                "suggestions_count": 282,
                "updated": "2022-12-15T23:59:33",
                "user_game": null,
                "reviews_count": 4207,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 21,
                            "name": "Android",
                            "slug": "android",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 52498,
                            "image_background": "https://media.rawg.io/media/games/daa/daaee07fcb40744d90cf8142f94a241f.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": {
                            "minimum": "4.4 and up"
                        },
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 74810,
                            "image_background": "https://media.rawg.io/media/games/b54/b54598d1d5cc31899f4f0a7e3122a7b0.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "macOS",
                            "slug": "macos",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 101428,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": {
                            "minimum": "<strong>Minimum: </strong>OS X version Leopard 10.5.8, Snow Leopard 10.6.3, 1GB RAM, NVIDIA GeForce 8 or higher, ATI X1600 or higher, or Intel HD 3000 or higher Mouse, Keyboard, Internet Connection"
                        },
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": {
                            "minimum": "<p><strong>Minimum: </strong>1.7 GHz Processor, 512MB RAM, DirectX&reg; 8.1 level Graphics Card (Requires support for SSE), Windows&reg; 7 (32/64-bit)/Vista/XP, Mouse, Keyboard, Internet Connection</p>\r\n\t\t\t<p><strong>Recommended: </strong>Pentium 4 processor (3.0GHz, or better), 1GB RAM, DirectX&reg; 9 level Graphics Card, Windows&reg; 7 (32/64-bit)/Vista/XP, Mouse, Keyboard, Internet Connection</p>"
                        },
                        "requirements_ru": {
                            "minimum": "Pentium 4/Athlon XP 1.7 ГГц,512 Мб памяти,3D-ускоритель со 128 Мб памяти,7.5 Гб на винчестере,Интернет-соединение 128 Кб/c",
                            "recommended": "Core 2 Duo/Athlon 64 3 ГГц,1 Гб памяти,3D-ускоритель с 512 Мб памяти,12 Гб на винчестере,Интернет-соединение 512 Кб/c"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo Switch",
                            "slug": "nintendo-switch",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5087,
                            "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                        },
                        "released_at": "2007-10-09",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 8,
                            "name": "Android",
                            "slug": "android"
                        }
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "Apple Macintosh",
                            "slug": "mac"
                        }
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo",
                            "slug": "nintendo"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 3,
                        "name": "Adventure",
                        "slug": "adventure",
                        "games_count": 128587,
                        "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Puzzle",
                        "slug": "puzzle",
                        "games_count": 95053,
                        "image_background": "https://media.rawg.io/media/games/2e1/2e187b31e5cee21c110bd16798d75fab.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 14890,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 40973,
                        "store": {
                            "id": 8,
                            "name": "Google Play",
                            "slug": "google-play",
                            "domain": "play.google.com",
                            "games_count": 16933,
                            "image_background": "https://media.rawg.io/media/games/d4b/d4bcd78873edd9992d93aff9cc8db0c8.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 42,
                        "name": "Great Soundtrack",
                        "slug": "great-soundtrack",
                        "language": "eng",
                        "games_count": 3221,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    },
                    {
                        "id": 118,
                        "name": "Story Rich",
                        "slug": "story-rich",
                        "language": "eng",
                        "games_count": 16869,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 32,
                        "name": "Sci-fi",
                        "slug": "sci-fi",
                        "language": "eng",
                        "games_count": 16264,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 40845,
                        "name": "Partial Controller Support",
                        "slug": "partial-controller-support",
                        "language": "eng",
                        "games_count": 9095,
                        "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 4,
                        "name": "Funny",
                        "slug": "funny",
                        "language": "eng",
                        "games_count": 21418,
                        "image_background": "https://media.rawg.io/media/games/8cc/8cce7c0e99dcc43d66c8efd42f9d03e3.jpg"
                    },
                    {
                        "id": 193,
                        "name": "Classic",
                        "slug": "classic",
                        "language": "eng",
                        "games_count": 1731,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 189,
                        "name": "Female Protagonist",
                        "slug": "female-protagonist",
                        "language": "eng",
                        "games_count": 9659,
                        "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                    },
                    {
                        "id": 123,
                        "name": "Comedy",
                        "slug": "comedy",
                        "language": "eng",
                        "games_count": 10191,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    {
                        "id": 40838,
                        "name": "Includes level editor",
                        "slug": "includes-level-editor",
                        "language": "eng",
                        "games_count": 1565,
                        "image_background": "https://media.rawg.io/media/games/58a/58ac7f6569259dcc0b60b921869b19fc.jpg"
                    },
                    {
                        "id": 111,
                        "name": "Short",
                        "slug": "short",
                        "language": "eng",
                        "games_count": 53825,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 40833,
                        "name": "Captions available",
                        "slug": "captions-available",
                        "language": "eng",
                        "games_count": 1206,
                        "image_background": "https://media.rawg.io/media/games/c2e/c2eb6021a2596644b437e943612af25c.jpg"
                    },
                    {
                        "id": 114,
                        "name": "Physics",
                        "slug": "physics",
                        "language": "eng",
                        "games_count": 17186,
                        "image_background": "https://media.rawg.io/media/screenshots/f5a/f5abab52c4d606551cd5ec3ab709e501.jpg"
                    },
                    {
                        "id": 148,
                        "name": "Dark Humor",
                        "slug": "dark-humor",
                        "language": "eng",
                        "games_count": 2320,
                        "image_background": "https://media.rawg.io/media/games/907/90757eaa9dc7c5cf7c47bf4960843999.jpg"
                    },
                    {
                        "id": 40834,
                        "name": "Commentary available",
                        "slug": "commentary-available",
                        "language": "eng",
                        "games_count": 249,
                        "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                    },
                    {
                        "id": 40839,
                        "name": "Includes Source SDK",
                        "slug": "includes-source-sdk",
                        "language": "eng",
                        "games_count": 57,
                        "image_background": "https://media.rawg.io/media/screenshots/955/9555a37348995cc27ed4f4e0b98df5f0.jpg"
                    },
                    {
                        "id": 87,
                        "name": "Science",
                        "slug": "science",
                        "language": "eng",
                        "games_count": 1440,
                        "image_background": "https://media.rawg.io/media/games/174/1743b3dd185bda4a7be349347d4064df.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 3,
                    "name": "Teen",
                    "slug": "teen"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                    },
                    {
                        "id": 115793,
                        "image": "https://media.rawg.io/media/screenshots/99e/99e94bd55eb75fa6e75c3dcbb1a570b2.jpg"
                    },
                    {
                        "id": 115794,
                        "image": "https://media.rawg.io/media/screenshots/2f0/2f0297a46934d9fa914c626902b1ce20.jpg"
                    },
                    {
                        "id": 115795,
                        "image": "https://media.rawg.io/media/screenshots/3b3/3b3713fbca6194dfc4d6e8a8d006d354.jpg"
                    },
                    {
                        "id": 115796,
                        "image": "https://media.rawg.io/media/screenshots/c6f/c6f9afc3e4dd51068b22f04acbc6ca99.jpg"
                    },
                    {
                        "id": 115797,
                        "image": "https://media.rawg.io/media/screenshots/748/74841207eec76ebc7fc03210168bfb7e.jpg"
                    },
                    {
                        "id": 115798,
                        "image": "https://media.rawg.io/media/screenshots/e72/e7256b4caedf099bcb8ebd332f892334.jpg"
                    }
                ]
            },
            {
                "id": 12020,
                "slug": "left-4-dead-2",
                "name": "Left 4 Dead 2",
                "released": "2009-11-17",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg",
                "rating": 4.09,
                "rating_top": 4,
                "ratings": [
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1570,
                        "percent": 53.46
                    },
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 919,
                        "percent": 31.29
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 339,
                        "percent": 11.54
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 109,
                        "percent": 3.71
                    }
                ],
                "ratings_count": 2922,
                "reviews_text_count": 8,
                "added": 13760,
                "added_by_status": {
                    "yet": 340,
                    "owned": 10010,
                    "beaten": 2192,
                    "toplay": 91,
                    "dropped": 994,
                    "playing": 133
                },
                "metacritic": 89,
                "playtime": 9,
                "suggestions_count": 578,
                "updated": "2022-12-16T02:34:49",
                "user_game": null,
                "reviews_count": 2937,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 5,
                            "name": "macOS",
                            "slug": "macos",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 101428,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2009-11-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 74810,
                            "image_background": "https://media.rawg.io/media/games/b54/b54598d1d5cc31899f4f0a7e3122a7b0.jpg"
                        },
                        "released_at": "2009-11-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2009-11-17",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 32/64-bit / Vista 32/64 / XP<br></li><li><strong>Processor:</strong> Pentium 4 3.0GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video card with 128 MB, Shader model 2.0. ATI X800, NVidia 6600 or better<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 13 GB available space<br></li><li><strong>Sound Card:</strong> DirectX 9.0c compatible sound card</li></ul>",
                            "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 32/64-bit / Vista 32/64 / XP<br></li><li><strong>Processor:</strong> Intel core 2 duo 2.4GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video Card Shader model 3.0. NVidia 7600, ATI X1600 or better<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 13 GB available space<br></li><li><strong>Sound Card:</strong> DirectX 9.0c compatible sound card</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "Pentium 4/Athlon 64 3 ГГц,1 Гб памяти,GeForce 6600/Radeon X800,7.5 Гб на винчестере",
                            "recommended": "Core 2 Duo/Athlon 64 X2 2.4 ГГц,2 Гб памяти,GeForce 7600/Radeon X1600,7.5 Гб на винчестере"
                        }
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2009-11-17",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "Apple Macintosh",
                            "slug": "mac"
                        }
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 2,
                        "name": "Shooter",
                        "slug": "shooter",
                        "games_count": 59038,
                        "image_background": "https://media.rawg.io/media/games/be0/be01c3d7d8795a45615da139322ca080.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 13208,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 34000,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 40849,
                        "name": "Steam Cloud",
                        "slug": "steam-cloud",
                        "language": "eng",
                        "games_count": 12911,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 18,
                        "name": "Co-op",
                        "slug": "co-op",
                        "language": "eng",
                        "games_count": 9264,
                        "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                    },
                    {
                        "id": 411,
                        "name": "cooperative",
                        "slug": "cooperative",
                        "language": "eng",
                        "games_count": 3753,
                        "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 16,
                        "name": "Horror",
                        "slug": "horror",
                        "language": "eng",
                        "games_count": 40091,
                        "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 9,
                        "name": "Online Co-Op",
                        "slug": "online-co-op",
                        "language": "eng",
                        "games_count": 3980,
                        "image_background": "https://media.rawg.io/media/games/476/476178ef18ab0534771d099f51cdc694.jpg"
                    },
                    {
                        "id": 26,
                        "name": "Gore",
                        "slug": "gore",
                        "language": "eng",
                        "games_count": 4811,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    },
                    {
                        "id": 1,
                        "name": "Survival",
                        "slug": "survival",
                        "language": "eng",
                        "games_count": 6663,
                        "image_background": "https://media.rawg.io/media/games/1bd/1bd2657b81eb0c99338120ad444b24ff.jpg"
                    },
                    {
                        "id": 75,
                        "name": "Local Co-Op",
                        "slug": "local-co-op",
                        "language": "eng",
                        "games_count": 4793,
                        "image_background": "https://media.rawg.io/media/games/27b/27b02ffaab6b250cc31bf43baca1fc34.jpg"
                    },
                    {
                        "id": 80,
                        "name": "Tactical",
                        "slug": "tactical",
                        "language": "eng",
                        "games_count": 3741,
                        "image_background": "https://media.rawg.io/media/games/59f/59fc1c5de1d29cb9234741c97d250150.jpg"
                    },
                    {
                        "id": 11669,
                        "name": "stats",
                        "slug": "stats",
                        "language": "eng",
                        "games_count": 4322,
                        "image_background": "https://media.rawg.io/media/games/0bd/0bd5646a3d8ee0ac3314bced91ea306d.jpg"
                    },
                    {
                        "id": 40852,
                        "name": "Steam Workshop",
                        "slug": "steam-workshop",
                        "language": "eng",
                        "games_count": 1248,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 63,
                        "name": "Zombies",
                        "slug": "zombies",
                        "language": "eng",
                        "games_count": 9448,
                        "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                    },
                    {
                        "id": 62,
                        "name": "Moddable",
                        "slug": "moddable",
                        "language": "eng",
                        "games_count": 750,
                        "image_background": "https://media.rawg.io/media/games/149/149bbed9d90dc09328ba79bbacfda3c8.jpg"
                    },
                    {
                        "id": 43,
                        "name": "Post-apocalyptic",
                        "slug": "post-apocalyptic",
                        "language": "eng",
                        "games_count": 3032,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    {
                        "id": 40833,
                        "name": "Captions available",
                        "slug": "captions-available",
                        "language": "eng",
                        "games_count": 1206,
                        "image_background": "https://media.rawg.io/media/games/c2e/c2eb6021a2596644b437e943612af25c.jpg"
                    },
                    {
                        "id": 17,
                        "name": "Survival Horror",
                        "slug": "survival-horror",
                        "language": "eng",
                        "games_count": 7359,
                        "image_background": "https://media.rawg.io/media/games/daa/daaee07fcb40744d90cf8142f94a241f.jpg"
                    },
                    {
                        "id": 5,
                        "name": "Replay Value",
                        "slug": "replay-value",
                        "language": "eng",
                        "games_count": 1190,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    {
                        "id": 11,
                        "name": "Team-Based",
                        "slug": "team-based",
                        "language": "eng",
                        "games_count": 1191,
                        "image_background": "https://media.rawg.io/media/games/c7a/c7a71a0531a9518236d99d0d60abe447.jpg"
                    },
                    {
                        "id": 40856,
                        "name": "Valve Anti-Cheat enabled",
                        "slug": "valve-anti-cheat-enabled",
                        "language": "eng",
                        "games_count": 104,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 40834,
                        "name": "Commentary available",
                        "slug": "commentary-available",
                        "language": "eng",
                        "games_count": 249,
                        "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                    },
                    {
                        "id": 40839,
                        "name": "Includes Source SDK",
                        "slug": "includes-source-sdk",
                        "language": "eng",
                        "games_count": 57,
                        "image_background": "https://media.rawg.io/media/screenshots/955/9555a37348995cc27ed4f4e0b98df5f0.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                    },
                    {
                        "id": 99748,
                        "image": "https://media.rawg.io/media/screenshots/4c0/4c043fd1a5ff78900483f2e82580fea0.jpg"
                    },
                    {
                        "id": 99749,
                        "image": "https://media.rawg.io/media/screenshots/c90/c9071628c238fbc20b366e2413dd8b4a.jpg"
                    },
                    {
                        "id": 99750,
                        "image": "https://media.rawg.io/media/screenshots/e29/e293b0f98092b8c0dbe24d66846088bb.jpg"
                    },
                    {
                        "id": 99751,
                        "image": "https://media.rawg.io/media/screenshots/168/16867bc76b385eb0fb749e41f7ada93d.jpg"
                    },
                    {
                        "id": 99752,
                        "image": "https://media.rawg.io/media/screenshots/fb9/fb917e562f311f48ff8d27632bd29a80.jpg"
                    },
                    {
                        "id": 99753,
                        "image": "https://media.rawg.io/media/screenshots/5f2/5f2ca569912add2a211b20ba3f576b97.jpg"
                    }
                ]
            },
            {
                "id": 4062,
                "slug": "bioshock-infinite",
                "name": "BioShock Infinite",
                "released": "2013-03-26",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg",
                "rating": 4.39,
                "rating_top": 5,
                "ratings": [
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 2043,
                        "percent": 55.53
                    },
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1223,
                        "percent": 33.24
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 315,
                        "percent": 8.56
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 98,
                        "percent": 2.66
                    }
                ],
                "ratings_count": 3646,
                "reviews_text_count": 21,
                "added": 13339,
                "added_by_status": {
                    "yet": 724,
                    "owned": 7916,
                    "beaten": 3853,
                    "toplay": 340,
                    "dropped": 415,
                    "playing": 91
                },
                "metacritic": 94,
                "playtime": 12,
                "suggestions_count": 591,
                "updated": "2022-12-16T02:36:02",
                "user_game": null,
                "reviews_count": 3679,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 18,
                            "name": "PlayStation 4",
                            "slug": "playstation4",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 6530,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo Switch",
                            "slug": "nintendo-switch",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5087,
                            "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 74810,
                            "image_background": "https://media.rawg.io/media/games/b54/b54598d1d5cc31899f4f0a7e3122a7b0.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista Service Pack 2 32-bit<br>\t</li><li><strong>Processor:</strong> Intel Core 2 DUO 2.4 GHz / AMD Athlon X2 2.7 GHz<br>\t</li><li><strong>Memory:</strong> 2GB<br>\t</li><li><strong>Hard Disk Space:</strong> 20 GB free<br>\t</li><li><strong>Video Card:</strong> DirectX10 Compatible ATI Radeon HD 3870 / NVIDIA 8800 GT / Intel HD 3000 Integrated Graphics<br>\t</li><li><strong>Video Card Memory:</strong> 512 MB\t<br>\t</li><li><strong>Sound:</strong> DirectX Compatible</li></ul>",
                            "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7 Service Pack 1 64-bit<br>\t</li><li><strong>Processor:</strong> Quad Core Processor<br>\t</li><li><strong>Memory:</strong> 4GB<br>\t</li><li><strong>Hard Disk Space:</strong> 30 GB free<br>\t</li><li><strong>Video Card:</strong> DirectX11 Compatible, AMD Radeon HD 6950 / NVIDIA GeForce GTX 560<br>\t</li><li><strong>Video Card Memory:</strong> 1024 MB\t<br>\t</li><li><strong>Sound:</strong> DirectX Compatible</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "Win Vista 32\nCore 2 Duo E4600/Athlon 64 X2 5200+\nGeForce GT 340/Radeon HD 3800\n2 GB RAM\n20 GB HDD",
                            "recommended": "Win 7 64\nCore 2 Quad Q6600/Athlon II X4 610e\nGeForce GTX 560/Radeon HD 6950\n4 GB RAM\n20 GB HDD"
                        }
                    },
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 1,
                            "name": "Xbox One",
                            "slug": "xbox-one",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 5443,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        },
                        "released_at": "2013-03-26",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux"
                        }
                    },
                    {
                        "platform": {
                            "id": 7,
                            "name": "Nintendo",
                            "slug": "nintendo"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 2,
                        "name": "Shooter",
                        "slug": "shooter",
                        "games_count": 59038,
                        "image_background": "https://media.rawg.io/media/games/be0/be01c3d7d8795a45615da139322ca080.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 828870,
                        "store": {
                            "id": 11,
                            "name": "Epic Games",
                            "slug": "epic-games",
                            "domain": "epicgames.com",
                            "games_count": 1173,
                            "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                        }
                    },
                    {
                        "id": 71727,
                        "store": {
                            "id": 4,
                            "name": "App Store",
                            "slug": "apple-appstore",
                            "domain": "apps.apple.com",
                            "games_count": 74250,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        }
                    },
                    {
                        "id": 440409,
                        "store": {
                            "id": 2,
                            "name": "Xbox Store",
                            "slug": "xbox-store",
                            "domain": "microsoft.com",
                            "games_count": 4755,
                            "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                        }
                    },
                    {
                        "id": 461035,
                        "store": {
                            "id": 6,
                            "name": "Nintendo Store",
                            "slug": "nintendo",
                            "domain": "nintendo.com",
                            "games_count": 8878,
                            "image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
                        }
                    },
                    {
                        "id": 4382,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 13084,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 33810,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 40849,
                        "name": "Steam Cloud",
                        "slug": "steam-cloud",
                        "language": "eng",
                        "games_count": 12911,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 42,
                        "name": "Great Soundtrack",
                        "slug": "great-soundtrack",
                        "language": "eng",
                        "games_count": 3221,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 118,
                        "name": "Story Rich",
                        "slug": "story-rich",
                        "language": "eng",
                        "games_count": 16869,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    {
                        "id": 8,
                        "name": "First-Person",
                        "slug": "first-person",
                        "language": "eng",
                        "games_count": 26299,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    {
                        "id": 32,
                        "name": "Sci-fi",
                        "slug": "sci-fi",
                        "language": "eng",
                        "games_count": 16264,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 64,
                        "name": "Fantasy",
                        "slug": "fantasy",
                        "language": "eng",
                        "games_count": 22740,
                        "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                    },
                    {
                        "id": 26,
                        "name": "Gore",
                        "slug": "gore",
                        "language": "eng",
                        "games_count": 4811,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    },
                    {
                        "id": 115,
                        "name": "Controller",
                        "slug": "controller",
                        "language": "eng",
                        "games_count": 8566,
                        "image_background": "https://media.rawg.io/media/games/410/41033a495ce8f7fd4b0934bdb975f12a.jpg"
                    },
                    {
                        "id": 119,
                        "name": "Dystopian",
                        "slug": "dystopian",
                        "language": "eng",
                        "games_count": 1668,
                        "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                    },
                    {
                        "id": 154,
                        "name": "Steampunk",
                        "slug": "steampunk",
                        "language": "eng",
                        "games_count": 1039,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 305,
                        "name": "Linear",
                        "slug": "linear",
                        "language": "eng",
                        "games_count": 3117,
                        "image_background": "https://media.rawg.io/media/games/a14/a14acef284eaa4854f83c99e80fc15d8.jpg"
                    },
                    {
                        "id": 208,
                        "name": "Alternate History",
                        "slug": "alternate-history",
                        "language": "eng",
                        "games_count": 1385,
                        "image_background": "https://media.rawg.io/media/games/702/7020d1319d09e0c6a840aa08c5ce120f.jpg"
                    },
                    {
                        "id": 317,
                        "name": "Time Travel",
                        "slug": "time-travel",
                        "language": "eng",
                        "games_count": 1591,
                        "image_background": "https://media.rawg.io/media/games/a28/a289e23b4d4d84f26ab59125e3be4483.jpg"
                    },
                    {
                        "id": 287,
                        "name": "Political",
                        "slug": "political",
                        "language": "eng",
                        "games_count": 484,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 98549,
                        "image": "https://media.rawg.io/media/screenshots/bf0/bf07e2c6d2c888d372917d9ef453c8a4.jpg"
                    },
                    {
                        "id": 98550,
                        "image": "https://media.rawg.io/media/screenshots/9d3/9d38833952812ad7888a6dc21699934f.jpg"
                    },
                    {
                        "id": 98551,
                        "image": "https://media.rawg.io/media/screenshots/595/59572d257b6797986e4eabcd1ee023fd.jpg"
                    },
                    {
                        "id": 98552,
                        "image": "https://media.rawg.io/media/screenshots/f71/f71c23eb76f050d6180490e82d58d799.jpg"
                    },
                    {
                        "id": 98553,
                        "image": "https://media.rawg.io/media/screenshots/871/8713411d5332ceb2b4092073a6f5f3f2.jpg"
                    },
                    {
                        "id": 98554,
                        "image": "https://media.rawg.io/media/screenshots/985/985b56daa78e0a23133518d4226e9f97.jpg"
                    }
                ]
            },
            {
                "id": 802,
                "slug": "borderlands-2",
                "name": "Borderlands 2",
                "released": "2012-09-18",
                "tba": false,
                "background_image": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg",
                "rating": 4.03,
                "rating_top": 4,
                "ratings": [
                    {
                        "id": 4,
                        "title": "recommended",
                        "count": 1409,
                        "percent": 47.86
                    },
                    {
                        "id": 5,
                        "title": "exceptional",
                        "count": 922,
                        "percent": 31.32
                    },
                    {
                        "id": 3,
                        "title": "meh",
                        "count": 496,
                        "percent": 16.85
                    },
                    {
                        "id": 1,
                        "title": "skip",
                        "count": 117,
                        "percent": 3.97
                    }
                ],
                "ratings_count": 2927,
                "reviews_text_count": 12,
                "added": 13174,
                "added_by_status": {
                    "yet": 536,
                    "owned": 9063,
                    "beaten": 2042,
                    "toplay": 193,
                    "dropped": 1127,
                    "playing": 213
                },
                "metacritic": 89,
                "playtime": 10,
                "suggestions_count": 678,
                "updated": "2022-12-15T11:14:18",
                "user_game": null,
                "reviews_count": 2944,
                "saturated_color": "0f0f0f",
                "dominant_color": "0f0f0f",
                "platforms": [
                    {
                        "platform": {
                            "id": 16,
                            "name": "PlayStation 3",
                            "slug": "playstation3",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 3489,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "macOS",
                            "slug": "macos",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 101428,
                            "image_background": "https://media.rawg.io/media/games/942/9424d6bb763dc38d9378b488603c87fa.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 4,
                            "name": "PC",
                            "slug": "pc",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 503856,
                            "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": {
                            "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP SP3<br>\t</li><li><strong>Processor:</strong> 2.4 GHz Dual Core Processor<br>\t</li><li><strong>Memory:</strong> 2 GB(XP)/ 2 GB(Vista)<br>\t</li><li><strong>Hard Disk Space:</strong> 13 GB free<br>\t</li><li><strong>Video Memory:</strong> 256 MB<br>\t</li><li><strong>Video Card:</strong> NVIDIA GeForce 8500 /ATI Radeon HD 2600<br>\t</li><li><strong>Sound:</strong> DirectX 9.0c Compatible<br>\t</li><li><strong>Other Requirements:</strong>Initial installation requires one-time internet connection for Steam authentication; software installations required (included with the game) include Steam Client, DirectX 9, Microsoft .NET 4 Framework, Visual C++ Redistributable 2005, Visual C++ Redistributable 2008, Visual C++ Redistributable 2010, and AMD CPU Drivers (XP Only/AMD Only)</li></ul>",
                            "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP SP3/Vista/Win 7<br>\t</li><li><strong>Processor:</strong> 2.3 GHz Quad Core processor<br>\t</li><li><strong>Memory:</strong> 2 GB<br>\t</li><li><strong>Hard Disk Space:</strong> 20 GB free<br>\t</li><li><strong>Video Memory:</strong> 512MB<br>\t</li><li><strong>Video Card:</strong> NVIDIA GeForce GTX 560 / ATI Radeon HD 5850<br>\t</li><li><strong>Sound:</strong> DirectX 9.0c Compatible<br>\t</li><li><strong>Other Requirements:</strong>Initial installation requires one-time internet connection for Steam authentication; software installations required (included with the game) include Steam Client, DirectX 9, Microsoft .NET 4 Framework, Visual C++ Redistributable 2005, Visual C++ Redistributable 2008, Visual C++ Redistributable 2010, and AMD CPU Drivers (XP Only/AMD Only)</li></ul>"
                        },
                        "requirements_ru": {
                            "minimum": "Core 2 Duo/Athlon 64 X2 2.4 ГГц,2 Гб памяти,GeForce 8500/Radeon HD 2600,13 Гб на винчестере,интернет-соединение",
                            "recommended": "Core i5/Phenom X4 2.3 ГГц,2 Гб памяти,GeForce GTX 560/Radeon HD 5850,20 Гб на винчестере,интернет-соединение"
                        }
                    },
                    {
                        "platform": {
                            "id": 21,
                            "name": "Android",
                            "slug": "android",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 52498,
                            "image_background": "https://media.rawg.io/media/games/daa/daaee07fcb40744d90cf8142f94a241f.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 74810,
                            "image_background": "https://media.rawg.io/media/games/b54/b54598d1d5cc31899f4f0a7e3122a7b0.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 19,
                            "name": "PS Vita",
                            "slug": "ps-vita",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 1863,
                            "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    },
                    {
                        "platform": {
                            "id": 14,
                            "name": "Xbox 360",
                            "slug": "xbox360",
                            "image": null,
                            "year_end": null,
                            "year_start": null,
                            "games_count": 2774,
                            "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                        },
                        "released_at": "2012-09-18",
                        "requirements_en": null,
                        "requirements_ru": null
                    }
                ],
                "parent_platforms": [
                    {
                        "platform": {
                            "id": 1,
                            "name": "PC",
                            "slug": "pc"
                        }
                    },
                    {
                        "platform": {
                            "id": 2,
                            "name": "PlayStation",
                            "slug": "playstation"
                        }
                    },
                    {
                        "platform": {
                            "id": 3,
                            "name": "Xbox",
                            "slug": "xbox"
                        }
                    },
                    {
                        "platform": {
                            "id": 8,
                            "name": "Android",
                            "slug": "android"
                        }
                    },
                    {
                        "platform": {
                            "id": 5,
                            "name": "Apple Macintosh",
                            "slug": "mac"
                        }
                    },
                    {
                        "platform": {
                            "id": 6,
                            "name": "Linux",
                            "slug": "linux"
                        }
                    }
                ],
                "genres": [
                    {
                        "id": 4,
                        "name": "Action",
                        "slug": "action",
                        "games_count": 168167,
                        "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                    },
                    {
                        "id": 2,
                        "name": "Shooter",
                        "slug": "shooter",
                        "games_count": 59038,
                        "image_background": "https://media.rawg.io/media/games/be0/be01c3d7d8795a45615da139322ca080.jpg"
                    },
                    {
                        "id": 5,
                        "name": "RPG",
                        "slug": "role-playing-games-rpg",
                        "games_count": 51116,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                ],
                "stores": [
                    {
                        "id": 4000,
                        "store": {
                            "id": 3,
                            "name": "PlayStation Store",
                            "slug": "playstation-store",
                            "domain": "store.playstation.com",
                            "games_count": 7787,
                            "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                        }
                    },
                    {
                        "id": 213037,
                        "store": {
                            "id": 8,
                            "name": "Google Play",
                            "slug": "google-play",
                            "domain": "play.google.com",
                            "games_count": 16933,
                            "image_background": "https://media.rawg.io/media/games/d4b/d4bcd78873edd9992d93aff9cc8db0c8.jpg"
                        }
                    },
                    {
                        "id": 11088,
                        "store": {
                            "id": 1,
                            "name": "Steam",
                            "slug": "steam",
                            "domain": "store.steampowered.com",
                            "games_count": 69655,
                            "image_background": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                        }
                    },
                    {
                        "id": 34042,
                        "store": {
                            "id": 7,
                            "name": "Xbox 360 Store",
                            "slug": "xbox360",
                            "domain": "marketplace.xbox.com",
                            "games_count": 1911,
                            "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                        }
                    },
                    {
                        "id": 71617,
                        "store": {
                            "id": 4,
                            "name": "App Store",
                            "slug": "apple-appstore",
                            "domain": "apps.apple.com",
                            "games_count": 74250,
                            "image_background": "https://media.rawg.io/media/games/960/960b601d9541cec776c5fa42a00bf6c4.jpg"
                        }
                    },
                    {
                        "id": 817,
                        "store": {
                            "id": 2,
                            "name": "Xbox Store",
                            "slug": "xbox-store",
                            "domain": "microsoft.com",
                            "games_count": 4755,
                            "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                        }
                    }
                ],
                "clip": null,
                "tags": [
                    {
                        "id": 31,
                        "name": "Singleplayer",
                        "slug": "singleplayer",
                        "language": "eng",
                        "games_count": 193456,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 40847,
                        "name": "Steam Achievements",
                        "slug": "steam-achievements",
                        "language": "eng",
                        "games_count": 28237,
                        "image_background": "https://media.rawg.io/media/games/4be/4be6a6ad0364751a96229c56bf69be59.jpg"
                    },
                    {
                        "id": 7,
                        "name": "Multiplayer",
                        "slug": "multiplayer",
                        "language": "eng",
                        "games_count": 34039,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 13,
                        "name": "Atmospheric",
                        "slug": "atmospheric",
                        "language": "eng",
                        "games_count": 26601,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    {
                        "id": 40836,
                        "name": "Full controller support",
                        "slug": "full-controller-support",
                        "language": "eng",
                        "games_count": 13259,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    },
                    {
                        "id": 40849,
                        "name": "Steam Cloud",
                        "slug": "steam-cloud",
                        "language": "eng",
                        "games_count": 12911,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    {
                        "id": 7808,
                        "name": "steam-trading-cards",
                        "slug": "steam-trading-cards",
                        "language": "eng",
                        "games_count": 7582,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    },
                    {
                        "id": 24,
                        "name": "RPG",
                        "slug": "rpg",
                        "language": "eng",
                        "games_count": 15924,
                        "image_background": "https://media.rawg.io/media/games/021/021c4e21a1824d2526f925eff6324653.jpg"
                    },
                    {
                        "id": 18,
                        "name": "Co-op",
                        "slug": "co-op",
                        "language": "eng",
                        "games_count": 9264,
                        "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                    },
                    {
                        "id": 36,
                        "name": "Open World",
                        "slug": "open-world",
                        "language": "eng",
                        "games_count": 5803,
                        "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                    },
                    {
                        "id": 411,
                        "name": "cooperative",
                        "slug": "cooperative",
                        "language": "eng",
                        "games_count": 3753,
                        "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                    },
                    {
                        "id": 32,
                        "name": "Sci-fi",
                        "slug": "sci-fi",
                        "language": "eng",
                        "games_count": 16264,
                        "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                    },
                    {
                        "id": 30,
                        "name": "FPS",
                        "slug": "fps",
                        "language": "eng",
                        "games_count": 11784,
                        "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                    },
                    {
                        "id": 9,
                        "name": "Online Co-Op",
                        "slug": "online-co-op",
                        "language": "eng",
                        "games_count": 3980,
                        "image_background": "https://media.rawg.io/media/games/476/476178ef18ab0534771d099f51cdc694.jpg"
                    },
                    {
                        "id": 4,
                        "name": "Funny",
                        "slug": "funny",
                        "language": "eng",
                        "games_count": 21418,
                        "image_background": "https://media.rawg.io/media/games/8cc/8cce7c0e99dcc43d66c8efd42f9d03e3.jpg"
                    },
                    {
                        "id": 123,
                        "name": "Comedy",
                        "slug": "comedy",
                        "language": "eng",
                        "games_count": 10191,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    {
                        "id": 97,
                        "name": "Action RPG",
                        "slug": "action-rpg",
                        "language": "eng",
                        "games_count": 5411,
                        "image_background": "https://media.rawg.io/media/games/f99/f9979698c43fd84c3ab69280576dd3af.jpg"
                    },
                    {
                        "id": 167,
                        "name": "Futuristic",
                        "slug": "futuristic",
                        "language": "eng",
                        "games_count": 3899,
                        "image_background": "https://media.rawg.io/media/games/8e4/8e4de3f54ac659e08a7ba6a2b731682a.jpg"
                    },
                    {
                        "id": 120,
                        "name": "Memes",
                        "slug": "memes",
                        "language": "eng",
                        "games_count": 1502,
                        "image_background": "https://media.rawg.io/media/games/c88/c88463dcf1b3fc79c54a59c30076344a.jpg"
                    },
                    {
                        "id": 148,
                        "name": "Dark Humor",
                        "slug": "dark-humor",
                        "language": "eng",
                        "games_count": 2320,
                        "image_background": "https://media.rawg.io/media/games/907/90757eaa9dc7c5cf7c47bf4960843999.jpg"
                    },
                    {
                        "id": 98,
                        "name": "Loot",
                        "slug": "loot",
                        "language": "eng",
                        "games_count": 1807,
                        "image_background": "https://media.rawg.io/media/screenshots/333/333e7121b588929dcf08eb99aff39ce5.jpg"
                    },
                    {
                        "id": 166,
                        "name": "Stylized",
                        "slug": "stylized",
                        "language": "eng",
                        "games_count": 3501,
                        "image_background": "https://media.rawg.io/media/screenshots/191/191b8c462102069c817d86295f45ac01.jpg"
                    }
                ],
                "esrb_rating": {
                    "id": 4,
                    "name": "Mature",
                    "slug": "mature"
                },
                "short_screenshots": [
                    {
                        "id": -1,
                        "image": "https://media.rawg.io/media/games/49c/49c3dfa4ce2f6f140cc4825868e858cb.jpg"
                    },
                    {
                        "id": 7041,
                        "image": "https://media.rawg.io/media/screenshots/adb/adbbb37113618ee107459cd5c344f2a8.jpg"
                    },
                    {
                        "id": 7062,
                        "image": "https://media.rawg.io/media/screenshots/616/61643dd96e936d29eb68cf53b2334e53.jpg"
                    },
                    {
                        "id": 7070,
                        "image": "https://media.rawg.io/media/screenshots/864/8644946ba14a03ab69f0766c42a03f80.jpg"
                    },
                    {
                        "id": 7072,
                        "image": "https://media.rawg.io/media/screenshots/f87/f87ad2b8f02b56e36c57b25cf8eac042.jpg"
                    },
                    {
                        "id": 7081,
                        "image": "https://media.rawg.io/media/screenshots/194/194e0962afa272604300001718a07793.jpg"
                    },
                    {
                        "id": 7088,
                        "image": "https://media.rawg.io/media/screenshots/297/29716964351ecd82545f1de3a50dfc4e.jpg"
                    }
                ]
            }
        ],
        "seo_title": "All Games",
        "seo_description": "",
        "seo_keywords": "",
        "seo_h1": "All Games",
        "noindex": false,
        "nofollow": false,
        "description": "",
        "filters": {
            "years": [
                {
                    "from": 2020,
                    "to": 2022,
                    "filter": "2020-01-01,2022-12-31",
                    "decade": 2020,
                    "years": [
                        {
                            "year": 2022,
                            "count": 169100,
                            "nofollow": false
                        },
                        {
                            "year": 2021,
                            "count": 173185,
                            "nofollow": false
                        },
                        {
                            "year": 2020,
                            "count": 133003,
                            "nofollow": false
                        }
                    ],
                    "nofollow": true,
                    "count": 475288
                },
                {
                    "from": 2010,
                    "to": 2019,
                    "filter": "2010-01-01,2019-12-31",
                    "decade": 2010,
                    "years": [
                        {
                            "year": 2019,
                            "count": 79731,
                            "nofollow": false
                        },
                        {
                            "year": 2018,
                            "count": 71553,
                            "nofollow": false
                        },
                        {
                            "year": 2017,
                            "count": 56539,
                            "nofollow": true
                        },
                        {
                            "year": 2016,
                            "count": 41362,
                            "nofollow": true
                        },
                        {
                            "year": 2015,
                            "count": 26444,
                            "nofollow": true
                        },
                        {
                            "year": 2014,
                            "count": 15619,
                            "nofollow": true
                        },
                        {
                            "year": 2013,
                            "count": 6346,
                            "nofollow": true
                        },
                        {
                            "year": 2012,
                            "count": 5380,
                            "nofollow": true
                        },
                        {
                            "year": 2011,
                            "count": 4314,
                            "nofollow": true
                        },
                        {
                            "year": 2010,
                            "count": 3883,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 311171
                },
                {
                    "from": 2000,
                    "to": 2009,
                    "filter": "2000-01-01,2009-12-31",
                    "decade": 2000,
                    "years": [
                        {
                            "year": 2009,
                            "count": 3104,
                            "nofollow": true
                        },
                        {
                            "year": 2008,
                            "count": 2027,
                            "nofollow": true
                        },
                        {
                            "year": 2007,
                            "count": 1551,
                            "nofollow": true
                        },
                        {
                            "year": 2006,
                            "count": 1275,
                            "nofollow": true
                        },
                        {
                            "year": 2005,
                            "count": 1142,
                            "nofollow": true
                        },
                        {
                            "year": 2004,
                            "count": 1148,
                            "nofollow": true
                        },
                        {
                            "year": 2003,
                            "count": 1130,
                            "nofollow": true
                        },
                        {
                            "year": 2002,
                            "count": 982,
                            "nofollow": true
                        },
                        {
                            "year": 2001,
                            "count": 1100,
                            "nofollow": true
                        },
                        {
                            "year": 2000,
                            "count": 985,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 14444
                },
                {
                    "from": 1990,
                    "to": 1999,
                    "filter": "1990-01-01,1999-12-31",
                    "decade": 1990,
                    "years": [
                        {
                            "year": 1999,
                            "count": 780,
                            "nofollow": true
                        },
                        {
                            "year": 1998,
                            "count": 720,
                            "nofollow": true
                        },
                        {
                            "year": 1997,
                            "count": 866,
                            "nofollow": true
                        },
                        {
                            "year": 1996,
                            "count": 752,
                            "nofollow": true
                        },
                        {
                            "year": 1995,
                            "count": 857,
                            "nofollow": true
                        },
                        {
                            "year": 1994,
                            "count": 813,
                            "nofollow": true
                        },
                        {
                            "year": 1993,
                            "count": 741,
                            "nofollow": true
                        },
                        {
                            "year": 1992,
                            "count": 642,
                            "nofollow": true
                        },
                        {
                            "year": 1991,
                            "count": 577,
                            "nofollow": true
                        },
                        {
                            "year": 1990,
                            "count": 535,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 7283
                },
                {
                    "from": 1980,
                    "to": 1989,
                    "filter": "1980-01-01,1989-12-31",
                    "decade": 1980,
                    "years": [
                        {
                            "year": 1989,
                            "count": 429,
                            "nofollow": true
                        },
                        {
                            "year": 1988,
                            "count": 314,
                            "nofollow": true
                        },
                        {
                            "year": 1987,
                            "count": 338,
                            "nofollow": true
                        },
                        {
                            "year": 1986,
                            "count": 246,
                            "nofollow": true
                        },
                        {
                            "year": 1985,
                            "count": 230,
                            "nofollow": true
                        },
                        {
                            "year": 1984,
                            "count": 185,
                            "nofollow": true
                        },
                        {
                            "year": 1983,
                            "count": 206,
                            "nofollow": true
                        },
                        {
                            "year": 1982,
                            "count": 148,
                            "nofollow": true
                        },
                        {
                            "year": 1981,
                            "count": 65,
                            "nofollow": true
                        },
                        {
                            "year": 1980,
                            "count": 35,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 2196
                },
                {
                    "from": 1970,
                    "to": 1979,
                    "filter": "1970-01-01,1979-12-31",
                    "decade": 1970,
                    "years": [
                        {
                            "year": 1979,
                            "count": 15,
                            "nofollow": true
                        },
                        {
                            "year": 1978,
                            "count": 17,
                            "nofollow": true
                        },
                        {
                            "year": 1977,
                            "count": 13,
                            "nofollow": true
                        },
                        {
                            "year": 1976,
                            "count": 7,
                            "nofollow": true
                        },
                        {
                            "year": 1975,
                            "count": 3,
                            "nofollow": true
                        },
                        {
                            "year": 1974,
                            "count": 2,
                            "nofollow": true
                        },
                        {
                            "year": 1973,
                            "count": 1,
                            "nofollow": true
                        },
                        {
                            "year": 1972,
                            "count": 2,
                            "nofollow": true
                        },
                        {
                            "year": 1971,
                            "count": 5,
                            "nofollow": true
                        },
                        {
                            "year": 1970,
                            "count": 1,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 66
                },
                {
                    "from": 1960,
                    "to": 1969,
                    "filter": "1960-01-01,1969-12-31",
                    "decade": 1960,
                    "years": [
                        {
                            "year": 1962,
                            "count": 1,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 1
                },
                {
                    "from": 1950,
                    "to": 1959,
                    "filter": "1950-01-01,1959-12-31",
                    "decade": 1950,
                    "years": [
                        {
                            "year": 1958,
                            "count": 1,
                            "nofollow": true
                        }
                    ],
                    "nofollow": true,
                    "count": 1
                }
            ]
        },
        "nofollow_collections": [
            "stores"
        ]
    }
""".trimIndent()