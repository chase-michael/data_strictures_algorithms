import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 17683 Data Structures for Application Programmers.
 * Homework 3 SortedLinkedList implementation with Recursion
 *
 * Test Driver with expected output
 * @author Terry Lee
 */
public class HW3Driver {

    /**
     * A client code to test SortedLinkedList.
     * @param args arguments
     */
    public static void main(String[] args) {
        MyArray words = new MyArray(10);
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("childrensbible.txt"), "latin1");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] wordsFromText = line.split("\\W");
                for (String word : wordsFromText) {
                    words.add(word.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find the file");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        String[] unsorted = new String[words.size()];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = words.get(i);
        }

        SortedLinkedList sortedWords = new SortedLinkedList(unsorted);

        String testValue = new String("david");
        if (sortedWords.contains(testValue)) {
            System.out.println("david is found");
        } else {
            System.out.println("not found");
        }

        System.out.println("Number of words in the file is: " + sortedWords.size());
        sortedWords.display();

        for (int i = 0; i < 9; i++) {
            sortedWords.removeFirst();
        }

        sortedWords.removeAt(0);

        System.out.println("Number of words in the file is: " + sortedWords.size());
        sortedWords.display();
    }

}

/* Expected output

david is found
Number of words in the file is: 1425
[a, abel, abigail, able, abound, about, above, abraham, absalom, accepted, account, acts, adam, advanced, advice, affairs, afraid, after, afterward, again, against, age, agreement, ahab, ai, alighted, alike, alive, all, alone, along, also, altar, always, am, america, among, an, ancient, and, angel, angels, angry, animal, animals, another, answer, answered, answers, antioch, any, anything, anywhere, appear, appeared, appreciate, are, ark, arms, arranged, arrive, as, ashes, aside, ask, asked, asks, asphalt, ass, asses, at, ate, athens, away, babel, babylonia, back, bake, baked, band, baptist, barnabas, be, bear, bears, beast, beasts, beautiful, became, because, become, been, beersheba, before, beg, began, beginning, behind, being, beings, believed, belly, below, best, bethel, bethlehem, better, between, bible, biblical, bird, birds, birthright, bless, blessed, blessing, blind, blindness, blood, blow, body, book, born, both, bound, bowed, bowman, boy, boyhood, boys, bracelets, brave, bread, breadth, break, breath, breathed, bricks, brimstone, bring, bringing, brings, briton, broad, broken, brother, brothers, brought, bruise, build, building, built, burnt, bush, but, by, c, cain, cakes, calf, call, called, calls, calms, came, camel, camels, can, cana, canaan, canaanites, cannot, capital, captives, capture, care, cared, cattle, caught, caused, cease, ceased, charge, charles, child, children, choice, chose, chosen, christ, christian, christians, church, cities, city, clean, cleared, closed, clothed, clothing, cloud, cold, color, come, comes, coming, command, commanded, commandments, commands, committed, companion, company, complaint, completely, concerning, condemn, condemned, condemns, confuse, confused, confusion, conquer, conquers, contains, contents, continued, control, converses, cool, copyright, corinth, cost, costly, count, counted, country, courage, cover, covered, covering, crawl, crawls, creation, creator, creature, creatures, creeping, creeps, crossing, crouches, crucified, cruel, cry, crying, curd, cures, curtis, cypress, damascus, danger, daniel, dared, darkness, daughter, daughters, david, dawn, day, days, de, dead, deal, death, deceitful, deceived, deceiver, decided, decides, declares, deed, deep, delay, demand, den, denouncing, department, descendant, desert, desire, destroy, destroyed, devoted, devotion, did, didst, die, died, different, difficult, difficulties, direction, disciples, dislikes, disobedience, displeased, displeasing, distance, divide, do, doers, doing, done, door, dove, down, drank, draw, dream, drew, dried, drink, drinking, drive, driven, dry, duotone, dusk, dust, duties, duty, dying, e, each, eager, eagerness, early, earn, earth, easily, east, eastward, eat, eaten, eating, eats, eden, educators, egypt, egyptian, eighty, either, eldest, elijah, elisha, else, emmaus, emptied, encourages, end, enemies, enemy, english, enjoy, enough, enter, entered, entrance, ephesus, ernest, errand, esau, escape, esther, ethiopian, eug, eve, even, evening, every, everything, everywhere, evil, exactly, except, expressed, eyes, face, facing, faith, faithful, faithfulness, fall, families, family, famous, far, farmer, fast, fat, fate, father, favor, fear, feast, feed, feeds, feet, fell, felt, female, field, fields, fifth, fifty, fig, fights, fill, filled, find, finding, finds, fine, finished, fire, first, fish, fishermen, fit, five, flesh, flock, flocks, flood, floods, fly, follow, followed, following, fond, food, foolish, foot, footsteps, for, forbade, forbid, foreign, forever, forgiveness, form, forth, forty, foster, found, foundations, four, fourth, free, freshly, friend, friends, fritz, fro, from, fruit, furnace, furnished, g, game, garden, garments, gate, gave, gazing, generosity, generous, genuine, get, giant, gideon, gifts, girardet, girdles, girl, give, given, gives, giving, gladly, glorified, glory, go, god, going, gold, golden, gomorrah, gone, good, goodness, gradually, grain, grand, granted, great, greater, greatly, green, grew, grieved, ground, grove, grow, growing, grown, grows, guilty, h, had, hagar, ham, haman, hand, hands, handwriting, happy, haran, hard, hark, harvest, has, hast, haste, hastened, hated, have, he, head, healing, heals, heard, hearted, heat, heaven, heavens, hebrew, hebron, heel, heights, heir, help, helped, helpers, henry, her, herb, herbert, herd, herds, herdsmen, here, heritage, hermitte, heroic, hesitated, hid, high, higher, hill, hills, hilltop, him, himself, hip, his, hold, holy, home, honor, hoped, horns, house, household, how, human, hundred, hungry, hunter, husband, i, idioms, if, illustration, illustrations, immortal, importance, in, including, increase, inheritance, instead, interest, interests, into, is, isaac, isaiah, ishmael, israel, it, its, itself, j, jacob, jairus, james, japheth, jar, jealousy, jehovah, jephthah, jeremiah, jericho, jerusalem, jesting, jesus, jireh, joash, job, john, jonah, jonathan, jordan, joseph, josiah, journey, joy, judah, judge, judges, juliaan, just, keep, keeper, kent, kept, kill, killed, killing, kills, kind, kindly, kindness, kinds, king, kingdom, knead, kneel, knew, knife, knight, know, knowledge, known, knows, l, laban, lack, lacking, lad, laid, lain, lamb, lame, land, landmark, lands, language, languages, large, last, later, law, lazarus, lazy, le, lead, leader, leaf, learn, learned, least, leaves, led, left, length, lepers, lesser, lest, let, lie, life, lift, lifted, light, lights, like, likes, lions, listen, listened, listening, literature, little, live, lived, living, lo, long, longer, look, looked, lord, lost, lot, love, loved, loving, low, lower, lowly, loyalty, macedonia, made, maids, make, makes, making, male, mamre, man, mantle, many, mark, marry, martha, martyr, mary, master, matter, may, mcmxxxvi, me, meal, mean, meaning, means, meanwhile, measures, meditate, meet, meeting, men, merciful, mercy, micaiah, middle, mighty, milcah, milk, minded, mine, missionaries, mist, mistake, mob, modest, modesty, money, monsters, month, months, moon, moore, more, moreh, moriah, morning, mortar, moses, most, mother, mountains, mouth, moved, must, my, myself, nahor, naked, name, named, narrow, nation, nations, native, nativity, ne, near, nearly, need, needs, nehemiah, never, new, night, nights, nine, no, noah, nor, normand, northward, nose, not, nothing, now, nurse, o, oak, oaks, obeyed, observation, of, off, offer, offered, offering, offerings, officer, often, oh, old, older, olive, on, once, one, only, opened, opposite, or, order, ornaments, other, others, ounces, our, ourselves, out, outside, over, overcome, overcoming, overtake, own, packs, page, pain, painted, paran, parents, parting, pass, passed, past, patriot, paul, pentecost, people, perhaps, peter, pharaoh, philip, philistines, pieces, pillar, pitch, pitched, place, placed, plain, plan, plant, planted, plants, playing, pleasant, please, pleased, plenty, plucked, pool, praise, praises, pray, prayed, prayer, preached, preaching, precious, preface, prepared, preparing, presence, pressed, pretend, printed, prison, prisoner, privilege, prodigal, professor, promise, promised, prophet, protection, protects, provide, provides, publishing, punished, punishment, put, quarrel, quarter, queen, questions, quickly, quiet, r, rain, rainbow, raise, raised, raising, ram, ran, raphael, raven, reached, read, readiness, reading, ready, really, rebekah, rebuilding, receive, red, refresh, refuge, refused, regret, regretted, rehoboam, relatives, religious, remains, remember, remembered, removed, replied, report, request, reserved, rest, rested, result, return, returned, reward, rewards, rib, ribs, rich, riches, richest, riding, right, righteous, rights, ring, rise, risen, river, riviere, roman, rome, roof, room, rooms, rose, rule, ruler, run, ruth, ryland, s, sacrifice, sacrificed, sad, saddled, safety, said, sake, salt, samaritan, samson, samuel, sand, sarah, sat, satisfied, saul, saved, saving, saw, say, saying, says, scandinavian, scattered, scowl, scribner, sea, searching, seas, seashore, seasons, second, secured, see, seed, seedtime, seeing, seeking, seem, seen, seest, seized, selections, selfish, sell, send, sends, sensible, sent, separate, separated, serpent, serpents, servant, servants, serve, served, set, seven, sevenfold, seventh, seventy, sewed, shadow, shall, she, shechem, sheep, shem, shepherd, sherman, shipwreck, short, should, shoulder, show, showed, showing, shown, shrubs, shut, sick, side, siemiradzki, sign, signs, silas, silently, silver, simple, sin, since, sinned, sinners, sins, sir, sirs, sister, sitting, sixth, skilful, skin, skins, sky, slade, slave, slay, sleep, slept, small, smelting, smoke, smote, so, sodom, soil, sold, soldier, solemn, solemnly, solomon, some, son, song, songs, sons, soon, sound, southward, sower, spare, spared, speak, speaking, speech, spend, spent, spies, split, spoke, spoken, spring, st, stand, standing, stars, start, started, states, stay, stayed, stephen, stew, stewed, still, stone, stood, stopped, stories, storm, story, strange, stranger, straw, street, strength, strong, strongly, struck, stubborn, study, subject, success, successful, such, suffer, suited, summer, sun, supper, support, suppose, surely, surface, surrounded, swallow, sweep, swept, syllable, take, taken, talents, talks, task, taylor, teachers, teachings, tell, telling, tells, temper, temple, ten, tender, tent, tents, terah, terrible, test, testament, testaments, tested, testing, text, than, that, the, thee, their, theirs, them, themselves, then, there, therefore, these, thessalonica, they, thicket, thief, thing, things, third, thirty, this, thoroughly, those, thou, though, thought, thoughts, thousands, three, throne, through, throw, thus, thy, till, time, tired, tissot, to, together, told, tongue, too, took, top, touch, toward, tower, town, training, tramp, translated, translation, travelled, treat, treated, treating, tree, trees, trials, trouble, troubles, trough, truly, trust, trusting, truth, try, turn, turned, twenty, twin, two, uhde, under, understand, understanding, unformed, ungrateful, united, university, unmarried, unselfishness, until, unto, up, upon, upright, urged, us, use, using, valley, veil, very, victories, victory, village, visits, voice, von, vriendt, w, waited, walk, walking, walks, wall, wandered, wanderer, warns, warriors, was, wash, watches, water, watered, waters, way, ways, we, weaned, wedding, weighing, weight, welcomed, well, went, were, westward, what, whatever, when, whenever, where, whether, which, while, whisper, who, whoever, whole, whom, whose, why, wicked, wide, widow, wife, wild, wilderness, will, willing, wilt, wind, window, wins, winter, wise, wish, with, withdrew, within, without, wives, woman, women, won, wonders, wood, woolsey, words, work, world, worse, worship, worshipped, worshipping, would, wound, writes, writing, wrong, wronged, yale, years, yeast, yes, yet, yield, york, you, young, younger, your, yours, yourself, yourselves, zaccheus, zimmerman, zoar]
Number of words in the file is: 1415
[account, acts, adam, advanced, advice, affairs, afraid, after, afterward, again, against, age, agreement, ahab, ai, alighted, alike, alive, all, alone, along, also, altar, always, am, america, among, an, ancient, and, angel, angels, angry, animal, animals, another, answer, answered, answers, antioch, any, anything, anywhere, appear, appeared, appreciate, are, ark, arms, arranged, arrive, as, ashes, aside, ask, asked, asks, asphalt, ass, asses, at, ate, athens, away, babel, babylonia, back, bake, baked, band, baptist, barnabas, be, bear, bears, beast, beasts, beautiful, became, because, become, been, beersheba, before, beg, began, beginning, behind, being, beings, believed, belly, below, best, bethel, bethlehem, better, between, bible, biblical, bird, birds, birthright, bless, blessed, blessing, blind, blindness, blood, blow, body, book, born, both, bound, bowed, bowman, boy, boyhood, boys, bracelets, brave, bread, breadth, break, breath, breathed, bricks, brimstone, bring, bringing, brings, briton, broad, broken, brother, brothers, brought, bruise, build, building, built, burnt, bush, but, by, c, cain, cakes, calf, call, called, calls, calms, came, camel, camels, can, cana, canaan, canaanites, cannot, capital, captives, capture, care, cared, cattle, caught, caused, cease, ceased, charge, charles, child, children, choice, chose, chosen, christ, christian, christians, church, cities, city, clean, cleared, closed, clothed, clothing, cloud, cold, color, come, comes, coming, command, commanded, commandments, commands, committed, companion, company, complaint, completely, concerning, condemn, condemned, condemns, confuse, confused, confusion, conquer, conquers, contains, contents, continued, control, converses, cool, copyright, corinth, cost, costly, count, counted, country, courage, cover, covered, covering, crawl, crawls, creation, creator, creature, creatures, creeping, creeps, crossing, crouches, crucified, cruel, cry, crying, curd, cures, curtis, cypress, damascus, danger, daniel, dared, darkness, daughter, daughters, david, dawn, day, days, de, dead, deal, death, deceitful, deceived, deceiver, decided, decides, declares, deed, deep, delay, demand, den, denouncing, department, descendant, desert, desire, destroy, destroyed, devoted, devotion, did, didst, die, died, different, difficult, difficulties, direction, disciples, dislikes, disobedience, displeased, displeasing, distance, divide, do, doers, doing, done, door, dove, down, drank, draw, dream, drew, dried, drink, drinking, drive, driven, dry, duotone, dusk, dust, duties, duty, dying, e, each, eager, eagerness, early, earn, earth, easily, east, eastward, eat, eaten, eating, eats, eden, educators, egypt, egyptian, eighty, either, eldest, elijah, elisha, else, emmaus, emptied, encourages, end, enemies, enemy, english, enjoy, enough, enter, entered, entrance, ephesus, ernest, errand, esau, escape, esther, ethiopian, eug, eve, even, evening, every, everything, everywhere, evil, exactly, except, expressed, eyes, face, facing, faith, faithful, faithfulness, fall, families, family, famous, far, farmer, fast, fat, fate, father, favor, fear, feast, feed, feeds, feet, fell, felt, female, field, fields, fifth, fifty, fig, fights, fill, filled, find, finding, finds, fine, finished, fire, first, fish, fishermen, fit, five, flesh, flock, flocks, flood, floods, fly, follow, followed, following, fond, food, foolish, foot, footsteps, for, forbade, forbid, foreign, forever, forgiveness, form, forth, forty, foster, found, foundations, four, fourth, free, freshly, friend, friends, fritz, fro, from, fruit, furnace, furnished, g, game, garden, garments, gate, gave, gazing, generosity, generous, genuine, get, giant, gideon, gifts, girardet, girdles, girl, give, given, gives, giving, gladly, glorified, glory, go, god, going, gold, golden, gomorrah, gone, good, goodness, gradually, grain, grand, granted, great, greater, greatly, green, grew, grieved, ground, grove, grow, growing, grown, grows, guilty, h, had, hagar, ham, haman, hand, hands, handwriting, happy, haran, hard, hark, harvest, has, hast, haste, hastened, hated, have, he, head, healing, heals, heard, hearted, heat, heaven, heavens, hebrew, hebron, heel, heights, heir, help, helped, helpers, henry, her, herb, herbert, herd, herds, herdsmen, here, heritage, hermitte, heroic, hesitated, hid, high, higher, hill, hills, hilltop, him, himself, hip, his, hold, holy, home, honor, hoped, horns, house, household, how, human, hundred, hungry, hunter, husband, i, idioms, if, illustration, illustrations, immortal, importance, in, including, increase, inheritance, instead, interest, interests, into, is, isaac, isaiah, ishmael, israel, it, its, itself, j, jacob, jairus, james, japheth, jar, jealousy, jehovah, jephthah, jeremiah, jericho, jerusalem, jesting, jesus, jireh, joash, job, john, jonah, jonathan, jordan, joseph, josiah, journey, joy, judah, judge, judges, juliaan, just, keep, keeper, kent, kept, kill, killed, killing, kills, kind, kindly, kindness, kinds, king, kingdom, knead, kneel, knew, knife, knight, know, knowledge, known, knows, l, laban, lack, lacking, lad, laid, lain, lamb, lame, land, landmark, lands, language, languages, large, last, later, law, lazarus, lazy, le, lead, leader, leaf, learn, learned, least, leaves, led, left, length, lepers, lesser, lest, let, lie, life, lift, lifted, light, lights, like, likes, lions, listen, listened, listening, literature, little, live, lived, living, lo, long, longer, look, looked, lord, lost, lot, love, loved, loving, low, lower, lowly, loyalty, macedonia, made, maids, make, makes, making, male, mamre, man, mantle, many, mark, marry, martha, martyr, mary, master, matter, may, mcmxxxvi, me, meal, mean, meaning, means, meanwhile, measures, meditate, meet, meeting, men, merciful, mercy, micaiah, middle, mighty, milcah, milk, minded, mine, missionaries, mist, mistake, mob, modest, modesty, money, monsters, month, months, moon, moore, more, moreh, moriah, morning, mortar, moses, most, mother, mountains, mouth, moved, must, my, myself, nahor, naked, name, named, narrow, nation, nations, native, nativity, ne, near, nearly, need, needs, nehemiah, never, new, night, nights, nine, no, noah, nor, normand, northward, nose, not, nothing, now, nurse, o, oak, oaks, obeyed, observation, of, off, offer, offered, offering, offerings, officer, often, oh, old, older, olive, on, once, one, only, opened, opposite, or, order, ornaments, other, others, ounces, our, ourselves, out, outside, over, overcome, overcoming, overtake, own, packs, page, pain, painted, paran, parents, parting, pass, passed, past, patriot, paul, pentecost, people, perhaps, peter, pharaoh, philip, philistines, pieces, pillar, pitch, pitched, place, placed, plain, plan, plant, planted, plants, playing, pleasant, please, pleased, plenty, plucked, pool, praise, praises, pray, prayed, prayer, preached, preaching, precious, preface, prepared, preparing, presence, pressed, pretend, printed, prison, prisoner, privilege, prodigal, professor, promise, promised, prophet, protection, protects, provide, provides, publishing, punished, punishment, put, quarrel, quarter, queen, questions, quickly, quiet, r, rain, rainbow, raise, raised, raising, ram, ran, raphael, raven, reached, read, readiness, reading, ready, really, rebekah, rebuilding, receive, red, refresh, refuge, refused, regret, regretted, rehoboam, relatives, religious, remains, remember, remembered, removed, replied, report, request, reserved, rest, rested, result, return, returned, reward, rewards, rib, ribs, rich, riches, richest, riding, right, righteous, rights, ring, rise, risen, river, riviere, roman, rome, roof, room, rooms, rose, rule, ruler, run, ruth, ryland, s, sacrifice, sacrificed, sad, saddled, safety, said, sake, salt, samaritan, samson, samuel, sand, sarah, sat, satisfied, saul, saved, saving, saw, say, saying, says, scandinavian, scattered, scowl, scribner, sea, searching, seas, seashore, seasons, second, secured, see, seed, seedtime, seeing, seeking, seem, seen, seest, seized, selections, selfish, sell, send, sends, sensible, sent, separate, separated, serpent, serpents, servant, servants, serve, served, set, seven, sevenfold, seventh, seventy, sewed, shadow, shall, she, shechem, sheep, shem, shepherd, sherman, shipwreck, short, should, shoulder, show, showed, showing, shown, shrubs, shut, sick, side, siemiradzki, sign, signs, silas, silently, silver, simple, sin, since, sinned, sinners, sins, sir, sirs, sister, sitting, sixth, skilful, skin, skins, sky, slade, slave, slay, sleep, slept, small, smelting, smoke, smote, so, sodom, soil, sold, soldier, solemn, solemnly, solomon, some, son, song, songs, sons, soon, sound, southward, sower, spare, spared, speak, speaking, speech, spend, spent, spies, split, spoke, spoken, spring, st, stand, standing, stars, start, started, states, stay, stayed, stephen, stew, stewed, still, stone, stood, stopped, stories, storm, story, strange, stranger, straw, street, strength, strong, strongly, struck, stubborn, study, subject, success, successful, such, suffer, suited, summer, sun, supper, support, suppose, surely, surface, surrounded, swallow, sweep, swept, syllable, take, taken, talents, talks, task, taylor, teachers, teachings, tell, telling, tells, temper, temple, ten, tender, tent, tents, terah, terrible, test, testament, testaments, tested, testing, text, than, that, the, thee, their, theirs, them, themselves, then, there, therefore, these, thessalonica, they, thicket, thief, thing, things, third, thirty, this, thoroughly, those, thou, though, thought, thoughts, thousands, three, throne, through, throw, thus, thy, till, time, tired, tissot, to, together, told, tongue, too, took, top, touch, toward, tower, town, training, tramp, translated, translation, travelled, treat, treated, treating, tree, trees, trials, trouble, troubles, trough, truly, trust, trusting, truth, try, turn, turned, twenty, twin, two, uhde, under, understand, understanding, unformed, ungrateful, united, university, unmarried, unselfishness, until, unto, up, upon, upright, urged, us, use, using, valley, veil, very, victories, victory, village, visits, voice, von, vriendt, w, waited, walk, walking, walks, wall, wandered, wanderer, warns, warriors, was, wash, watches, water, watered, waters, way, ways, we, weaned, wedding, weighing, weight, welcomed, well, went, were, westward, what, whatever, when, whenever, where, whether, which, while, whisper, who, whoever, whole, whom, whose, why, wicked, wide, widow, wife, wild, wilderness, will, willing, wilt, wind, window, wins, winter, wise, wish, with, withdrew, within, without, wives, woman, women, won, wonders, wood, woolsey, words, work, world, worse, worship, worshipped, worshipping, would, wound, writes, writing, wrong, wronged, yale, years, yeast, yes, yet, yield, york, you, young, younger, your, yours, yourself, yourselves, zaccheus, zimmerman, zoar]

*/
