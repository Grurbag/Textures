// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKeeperOfSecrets extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body2;
	private final ModelRenderer booba;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer cock_cape;
	private final ModelRenderer cape;
	private final ModelRenderer cape_r1;
	private final ModelRenderer cape_head;
	private final ModelRenderer head;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer hairs_crown;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_bot_right;
	private final ModelRenderer hand_bot_right2;
	private final ModelRenderer leftWeaponPoint2;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_bot_left;
	private final ModelRenderer hand_bot_left2;
	private final ModelRenderer leftWeaponPoint;
	private final ModelRenderer leftArmClaw;
	private final ModelRenderer hand_top_left;
	private final ModelRenderer hand_top_left2;
	private final ModelRenderer hand_top_left3;
	private final ModelRenderer claw_left;
	private final ModelRenderer claw_left_r1;
	private final ModelRenderer claw_left_texture;
	private final ModelRenderer claw_left2;
	private final ModelRenderer claw_left2_r1;
	private final ModelRenderer claw_left3;
	private final ModelRenderer claw_left3_r1;
	private final ModelRenderer rightArmClaw;
	private final ModelRenderer hand_top_right;
	private final ModelRenderer hand_top_right2;
	private final ModelRenderer hand_top_right3;
	private final ModelRenderer claw_right;
	private final ModelRenderer claw_right_r1;
	private final ModelRenderer claw_right_texture2;
	private final ModelRenderer claw_right2;
	private final ModelRenderer claw_right2_r1;
	private final ModelRenderer claw_right3;
	private final ModelRenderer claw_right3_r1;

	public WFMModelKeeperOfSecrets() {
		texWidth = 256;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, -6.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setPos(0.0F, -5.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.1309F, 0.0F, 0.0F);
		body_r1.texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 12.0F, 18.0F, 10.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -17.0F, 0.0F);
		body.addChild(body2);
		body2.texOffs(46, 0).addBox(-10.0F, -16.0F, -4.0F, 18.0F, 14.0F, 11.0F, 0.0F, false);

		booba = new ModelRenderer(this);
		booba.setPos(0.0F, -16.0F, -1.0F);
		body.addChild(booba);
		booba.texOffs(103, 0).addBox(-9.0F, -13.0F, -4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -33.0F, 0.0F);
		body.addChild(neck);
		neck.texOffs(86, 30).addBox(-3.0F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(-1.0F, -2.0F, 5.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.9163F, 0.0F, 0.0F);
		tail.texOffs(214, 0).addBox(-2.0F, -5.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(0.0F, 0.0F, 12.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.4363F, 0.0F, 0.0F);
		tail2.texOffs(214, 20).addBox(-1.0F, -4.0F, 0.0F, 3.0F, 3.0F, 18.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(-1.0F, 0.0F, 16.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.4363F, 0.0F, 0.0F);
		tail3.texOffs(223, 45).addBox(1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 15.0F, 0.0F, false);

		cock_cape = new ModelRenderer(this);
		cock_cape.setPos(0.0F, -1.0F, -2.0F);
		body.addChild(cock_cape);
		cock_cape.texOffs(189, 0).addBox(-6.0F, -4.0F, 1.0F, 10.0F, 31.0F, 0.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 30.0F, 0.0F);
		body.addChild(cape);
		

		cape_r1 = new ModelRenderer(this);
		cape_r1.setPos(-0.5F, -36.0F, 7.0F);
		cape.addChild(cape_r1);
		setRotationAngle(cape_r1, 0.2618F, 0.0F, 0.0F);
		cape_r1.texOffs(214, 72).addBox(-10.5F, -26.0F, 7.0F, 21.0F, 56.0F, 0.0F, 0.0F, false);

		cape_head = new ModelRenderer(this);
		cape_head.setPos(-0.5F, -25.8799F, 7.2791F);
		body.addChild(cape_head);
		cape_head.texOffs(150, 73).addBox(-11.5F, -26.1201F, -0.2791F, 23.0F, 20.0F, 0.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(-1.0F, -41.0F, -1.0F);
		head.texOffs(37, 27).addBox(-7.0F, -14.0F, -8.0F, 15.0F, 18.0F, 15.0F, -3.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(-3.5F, -10.5F, -2.5F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.2546F, 0.4114F, 0.577F);
		horn_right.texOffs(36, 70).addBox(-8.5F, -4.5F, -4.5F, 13.0F, 9.0F, 9.0F, -3.0F, false);

		horn_right2 = new ModelRenderer(this);
		horn_right2.setPos(-5.0F, 1.0F, 1.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 0.0F, 0.0F, -0.9163F);
		horn_right2.texOffs(36, 94).addBox(-7.5F, -4.5F, -5.0F, 12.0F, 8.0F, 8.0F, -3.0F, false);

		horn_right3 = new ModelRenderer(this);
		horn_right3.setPos(-4.0F, 1.0F, 1.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, 0.0F, 0.0F, -0.9163F);
		horn_right3.texOffs(36, 114).addBox(-7.5F, -4.5F, -5.5F, 12.0F, 7.0F, 7.0F, -3.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(3.5F, -10.5F, -2.5F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 2.887F, 0.4114F, 2.5646F);
		horn_left.texOffs(36, 70).addBox(-8.5F, -4.5F, -4.5F, 13.0F, 9.0F, 9.0F, -3.0F, false);

		horn_left2 = new ModelRenderer(this);
		horn_left2.setPos(-5.0F, 1.0F, 1.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, -0.9163F);
		horn_left2.texOffs(36, 94).addBox(-7.5F, -4.5F, -5.0F, 12.0F, 8.0F, 8.0F, -3.0F, false);

		horn_left3 = new ModelRenderer(this);
		horn_left3.setPos(-4.0F, 1.0F, 1.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, 0.0F, 0.0F, -0.9163F);
		horn_left3.texOffs(36, 114).addBox(-7.5F, -4.5F, -5.5F, 12.0F, 7.0F, 7.0F, -3.0F, false);

		hairs_crown = new ModelRenderer(this);
		hairs_crown.setPos(0.5F, -16.5F, -3.0F);
		head.addChild(hairs_crown);
		setRotationAngle(hairs_crown, -0.3491F, 0.0F, 0.0F);
		hairs_crown.texOffs(150, 94).addBox(-11.5F, -11.5F, 0.0F, 23.0F, 23.0F, 0.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-4.0F, -9.0F, 4.0F);
		

		leg_right = new ModelRenderer(this);
		leg_right.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(leg_right);
		setRotationAngle(leg_right, -0.4363F, 0.0F, 0.0F);
		leg_right.texOffs(0, 45).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 17.0F, 7.0F, 0.0F, false);

		leg_right2 = new ModelRenderer(this);
		leg_right2.setPos(-4.0F, 15.5315F, 3.1131F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.1345F, 0.0F, 0.0F);
		leg_right2.texOffs(0, 69).addBox(-0.5F, -5.556F, -0.8723F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg_right3 = new ModelRenderer(this);
		leg_right3.setPos(0.0F, 8.0F, -4.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -0.6981F, 0.0F, 0.0F);
		leg_right3.texOffs(1, 89).addBox(0.0F, -6.3221F, -0.2295F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leg_right4 = new ModelRenderer(this);
		leg_right4.setPos(0.0F, 2.0F, -1.0F);
		leg_right3.addChild(leg_right4);
		leg_right4.texOffs(0, 109).addBox(-0.5F, 2.6779F, -1.2295F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(3.0F, -9.0F, 4.0F);
		

		leg_left = new ModelRenderer(this);
		leg_left.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leg_left);
		setRotationAngle(leg_left, -0.4363F, 0.0F, 0.0F);
		leg_left.texOffs(0, 45).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 17.0F, 7.0F, 0.0F, false);

		leg_left2 = new ModelRenderer(this);
		leg_left2.setPos(-1.0F, 15.5315F, 3.1131F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.1345F, 0.0F, 0.0F);
		leg_left2.texOffs(0, 69).addBox(-0.5F, -5.556F, -0.8723F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg_left3 = new ModelRenderer(this);
		leg_left3.setPos(0.0F, 8.0F, -4.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -0.6981F, 0.0F, 0.0F);
		leg_left3.texOffs(1, 89).addBox(0.0F, -6.3221F, -0.2295F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leg_left4 = new ModelRenderer(this);
		leg_left4.setPos(0.0F, 2.0F, -1.0F);
		leg_left3.addChild(leg_left4);
		leg_left4.texOffs(0, 109).addBox(-0.5F, 2.6779F, -1.2295F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-9.0F, -26.0F, 1.0F);
		

		hand_bot_right = new ModelRenderer(this);
		hand_bot_right.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(hand_bot_right);
		setRotationAngle(hand_bot_right, 0.0F, 0.0F, 0.0873F);
		hand_bot_right.texOffs(139, 0).addBox(-5.8219F, -3.9205F, -3.0F, 6.0F, 9.0F, 7.0F, 0.0F, false);

		hand_bot_right2 = new ModelRenderer(this);
		hand_bot_right2.setPos(-0.8219F, 11.0795F, 0.0F);
		hand_bot_right.addChild(hand_bot_right2);
		hand_bot_right2.texOffs(141, 17).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 16.0F, 5.0F, 0.0F, false);

		leftWeaponPoint2 = new ModelRenderer(this);
		leftWeaponPoint2.setPos(-2.1781F, 3.9205F, -1.0F);
		hand_bot_right2.addChild(leftWeaponPoint2);
		leftWeaponPoint2.texOffs(4, 2).addBox(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(8.0F, -26.0F, 1.0F);
		

		hand_bot_left = new ModelRenderer(this);
		hand_bot_left.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(hand_bot_left);
		setRotationAngle(hand_bot_left, 0.0F, 0.0F, -0.0873F);
		hand_bot_left.texOffs(139, 0).addBox(-1.1895F, -3.659F, -3.0F, 6.0F, 9.0F, 7.0F, 0.0F, true);

		hand_bot_left2 = new ModelRenderer(this);
		hand_bot_left2.setPos(3.8105F, 11.341F, 0.0F);
		hand_bot_left.addChild(hand_bot_left2);
		hand_bot_left2.texOffs(141, 17).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 16.0F, 5.0F, 0.0F, true);

		leftWeaponPoint = new ModelRenderer(this);
		leftWeaponPoint.setPos(-1.8105F, 3.659F, -1.0F);
		hand_bot_left2.addChild(leftWeaponPoint);
		leftWeaponPoint.texOffs(4, 2).addBox(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftArmClaw = new ModelRenderer(this);
		leftArmClaw.setPos(7.0F, -35.0F, 3.0F);
		

		hand_top_left = new ModelRenderer(this);
		hand_top_left.setPos(0.0F, 0.0F, 0.0F);
		leftArmClaw.addChild(hand_top_left);
		setRotationAngle(hand_top_left, 0.4363F, 0.0F, -0.7854F);
		hand_top_left.texOffs(139, 0).addBox(-1.4645F, -2.7957F, -4.4942F, 6.0F, 9.0F, 7.0F, 0.0F, true);

		hand_top_left2 = new ModelRenderer(this);
		hand_top_left2.setPos(3.5355F, 12.2043F, -1.4942F);
		hand_top_left.addChild(hand_top_left2);
		hand_top_left2.texOffs(119, 20).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 12.0F, 5.0F, 0.0F, true);

		hand_top_left3 = new ModelRenderer(this);
		hand_top_left3.setPos(0.0F, 7.0F, -4.0F);
		hand_top_left2.addChild(hand_top_left3);
		setRotationAngle(hand_top_left3, -0.9599F, 0.0F, 0.0F);
		hand_top_left3.texOffs(119, 42).addBox(-3.9F, -6.0F, -2.0F, 4.0F, 12.0F, 5.0F, 0.0F, true);

		claw_left = new ModelRenderer(this);
		claw_left.setPos(0.0F, 0.0F, 0.0F);
		hand_top_left3.addChild(claw_left);
		setRotationAngle(claw_left, -0.9599F, 0.0F, 0.0F);
		

		claw_left_r1 = new ModelRenderer(this);
		claw_left_r1.setPos(0.0F, 0.0F, 0.0F);
		claw_left.addChild(claw_left_r1);
		setRotationAngle(claw_left_r1, 1.3526F, 0.0F, 0.0F);
		claw_left_r1.texOffs(133, 66).addBox(-2.9F, 4.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, true);

		claw_left_texture = new ModelRenderer(this);
		claw_left_texture.setPos(0.0F, 0.0F, 0.0F);
		claw_left.addChild(claw_left_texture);
		claw_left_texture.texOffs(141, 19).addBox(-2.0F, 2.0F, 4.0F, 0.0F, 17.0F, 24.0F, 0.0F, true);

		claw_left2 = new ModelRenderer(this);
		claw_left2.setPos(0.0F, -1.0F, 10.0F);
		claw_left.addChild(claw_left2);
		setRotationAngle(claw_left2, -0.48F, 0.0F, 0.0F);
		

		claw_left2_r1 = new ModelRenderer(this);
		claw_left2_r1.setPos(0.0F, 0.0F, 0.0F);
		claw_left2.addChild(claw_left2_r1);
		setRotationAngle(claw_left2_r1, 1.3526F, 0.0F, 0.0F);
		claw_left2_r1.texOffs(119, 70).addBox(-2.5F, 5.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, true);

		claw_left3 = new ModelRenderer(this);
		claw_left3.setPos(-2.0F, 8.6525F, -3.3453F);
		hand_top_left3.addChild(claw_left3);
		setRotationAngle(claw_left3, -1.8326F, 0.0F, 0.0F);
		

		claw_left3_r1 = new ModelRenderer(this);
		claw_left3_r1.setPos(2.0F, -2.6525F, -9.6547F);
		claw_left3.addChild(claw_left3_r1);
		setRotationAngle(claw_left3_r1, 1.3526F, 0.0F, 0.0F);
		claw_left3_r1.texOffs(119, 70).addBox(-2.5F, 5.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, true);

		rightArmClaw = new ModelRenderer(this);
		rightArmClaw.setPos(-9.0F, -34.0F, 3.0F);
		

		hand_top_right = new ModelRenderer(this);
		hand_top_right.setPos(0.0F, 0.0F, 0.0F);
		rightArmClaw.addChild(hand_top_right);
		setRotationAngle(hand_top_right, 0.4363F, 0.0F, 0.7854F);
		hand_top_right.texOffs(139, 0).addBox(-4.2929F, -4.0774F, -3.8965F, 6.0F, 9.0F, 7.0F, 0.0F, false);

		hand_top_right2 = new ModelRenderer(this);
		hand_top_right2.setPos(0.7071F, 10.9226F, -0.8965F);
		hand_top_right.addChild(hand_top_right2);
		hand_top_right2.texOffs(119, 20).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		hand_top_right3 = new ModelRenderer(this);
		hand_top_right3.setPos(0.0F, 7.0F, -4.0F);
		hand_top_right2.addChild(hand_top_right3);
		setRotationAngle(hand_top_right3, -0.9599F, 0.0F, 0.0F);
		hand_top_right3.texOffs(119, 42).addBox(-3.9F, -6.0F, -2.0F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		claw_right = new ModelRenderer(this);
		claw_right.setPos(0.0F, 0.0F, 0.0F);
		hand_top_right3.addChild(claw_right);
		setRotationAngle(claw_right, -0.9599F, 0.0F, 0.0F);
		

		claw_right_r1 = new ModelRenderer(this);
		claw_right_r1.setPos(0.0F, 0.0F, 0.0F);
		claw_right.addChild(claw_right_r1);
		setRotationAngle(claw_right_r1, 1.3526F, 0.0F, 0.0F);
		claw_right_r1.texOffs(133, 66).addBox(-2.9F, 4.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		claw_right_texture2 = new ModelRenderer(this);
		claw_right_texture2.setPos(0.0F, 0.0F, 0.0F);
		claw_right.addChild(claw_right_texture2);
		claw_right_texture2.texOffs(141, 19).addBox(-2.0F, 2.0F, 4.0F, 0.0F, 17.0F, 24.0F, 0.0F, false);

		claw_right2 = new ModelRenderer(this);
		claw_right2.setPos(0.0F, -1.0F, 10.0F);
		claw_right.addChild(claw_right2);
		setRotationAngle(claw_right2, -0.48F, 0.0F, 0.0F);
		

		claw_right2_r1 = new ModelRenderer(this);
		claw_right2_r1.setPos(0.0F, 0.0F, 0.0F);
		claw_right2.addChild(claw_right2_r1);
		setRotationAngle(claw_right2_r1, 1.3526F, 0.0F, 0.0F);
		claw_right2_r1.texOffs(119, 70).addBox(-2.5F, 5.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		claw_right3 = new ModelRenderer(this);
		claw_right3.setPos(-2.0F, 8.6525F, -3.3453F);
		hand_top_right3.addChild(claw_right3);
		setRotationAngle(claw_right3, -1.8326F, 0.0F, 0.0F);
		

		claw_right3_r1 = new ModelRenderer(this);
		claw_right3_r1.setPos(2.0F, -2.6525F, -9.6547F);
		claw_right3.addChild(claw_right3_r1);
		setRotationAngle(claw_right3_r1, 1.3526F, 0.0F, 0.0F);
		claw_right3_r1.texOffs(119, 70).addBox(-2.5F, 5.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmClaw.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmClaw.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}