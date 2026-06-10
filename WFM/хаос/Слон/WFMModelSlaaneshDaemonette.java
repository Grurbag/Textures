// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSlaaneshDaemonette extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tits;
	private final ModelRenderer titRight;
	private final ModelRenderer titLeft;
	private final ModelRenderer cape;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer claw;
	private final ModelRenderer claw2;
	private final ModelRenderer claw3;
	private final ModelRenderer clawSmall;
	private final ModelRenderer clawSmall2;
	private final ModelRenderer clawSmall3;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer claw4;
	private final ModelRenderer claw5;
	private final ModelRenderer claw6;
	private final ModelRenderer clawSmall4;
	private final ModelRenderer clawSmall5;
	private final ModelRenderer clawSmall6;
	private final ModelRenderer head;
	private final ModelRenderer ear;
	private final ModelRenderer ear2;
	private final ModelRenderer tongue;
	private final ModelRenderer tongue2;
	private final ModelRenderer tongue3;
	private final ModelRenderer tongue4;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer rightLegClawBig2;
	private final ModelRenderer rightLegClawBig3;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer rightLegClawBig4;
	private final ModelRenderer rightLegClawBig5;
	private final ModelRenderer spike;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer rightLegClawBig6;
	private final ModelRenderer rightLegClawBig7;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer rightLegClawBig8;
	private final ModelRenderer rightLegClawBig9;
	private final ModelRenderer spike2;

	public WFMModelSlaaneshDaemonette() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 2.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.texOffs(54, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 5.0F, 1.5F);
		body.addChild(tail);
		setRotationAngle(tail, 0.829F, 0.0F, 0.0F);
		tail.texOffs(116, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 7.0F, 3.0F, -0.5F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(0.0F, 5.0F, 0.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.6981F, 0.0F, 0.0F);
		tail2.texOffs(116, 10).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, -0.7F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(0.0F, 4.0F, 0.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.3927F, 0.0F, 0.0F);
		tail3.texOffs(116, 21).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, -0.9F, false);

		tail4 = new ModelRenderer(this);
		tail4.setPos(0.0F, 3.0F, 0.0F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, 0.48F, 0.0F, 0.0F);
		tail4.texOffs(116, 31).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, -0.91F, false);

		tail5 = new ModelRenderer(this);
		tail5.setPos(0.0F, 3.0F, 1.0F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.8727F, 0.0F, 0.0F);
		tail5.texOffs(116, 43).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, -1.1F, false);

		tits = new ModelRenderer(this);
		tits.setPos(-3.0F, -3.0F, -2.0F);
		body.addChild(tits);
		

		titRight = new ModelRenderer(this);
		titRight.setPos(0.5F, 0.5F, -0.5F);
		tits.addChild(titRight);
		setRotationAngle(titRight, 0.0F, 0.7854F, 0.0F);
		titRight.texOffs(45, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titRight.texOffs(64, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titRight.texOffs(58, 52).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titRight.texOffs(56, 55).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		titLeft = new ModelRenderer(this);
		titLeft.setPos(5.5F, 0.5F, -0.5F);
		tits.addChild(titLeft);
		setRotationAngle(titLeft, 0.0F, 0.7854F, 0.0F);
		titLeft.texOffs(45, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titLeft.texOffs(64, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titLeft.texOffs(58, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titLeft.texOffs(56, 61).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 4.0F, 2.0F);
		body.addChild(cape);
		cape.texOffs(34, 0).addBox(-3.5F, -2.0F, 0.1F, 7.0F, 16.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -2.0F, 0.0F);
		

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(leftArm2);
		setRotationAngle(leftArm2, 0.0F, 0.0F, -0.0873F);
		leftArm2.texOffs(40, 16).addBox(0.0F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

		claw = new ModelRenderer(this);
		claw.setPos(1.0F, 10.0F, -1.0F);
		leftArm2.addChild(claw);
		setRotationAngle(claw, -0.6545F, 0.0F, 0.0F);
		claw.texOffs(40, 35).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		claw.texOffs(48, 35).addBox(0.5F, 0.0F, 1.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);

		claw2 = new ModelRenderer(this);
		claw2.setPos(0.0F, 4.0F, 0.0F);
		claw.addChild(claw2);
		setRotationAngle(claw2, 0.7418F, 0.0F, 0.0F);
		claw2.texOffs(40, 43).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		claw2.texOffs(46, 43).addBox(0.49F, 1.0F, 1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

		claw3 = new ModelRenderer(this);
		claw3.setPos(0.0F, 4.0F, 0.0F);
		claw2.addChild(claw3);
		claw3.texOffs(41, 50).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		claw3.texOffs(45, 49).addBox(0.5F, 0.0F, 1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		clawSmall = new ModelRenderer(this);
		clawSmall.setPos(2.0F, 11.0F, 2.0F);
		leftArm2.addChild(clawSmall);
		setRotationAngle(clawSmall, 0.2618F, 0.0F, 0.0F);
		clawSmall.texOffs(52, 35).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		clawSmall2 = new ModelRenderer(this);
		clawSmall2.setPos(0.0F, 2.0F, 0.0F);
		clawSmall.addChild(clawSmall2);
		setRotationAngle(clawSmall2, -0.4363F, 0.0F, 0.0F);
		clawSmall2.texOffs(52, 40).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		clawSmall3 = new ModelRenderer(this);
		clawSmall3.setPos(0.0F, 2.0F, 0.0F);
		clawSmall2.addChild(clawSmall3);
		clawSmall3.texOffs(52, 46).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -2.0F, 0.0F);
		

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(rightArm2);
		setRotationAngle(rightArm2, 0.0F, 0.0F, 0.0873F);
		rightArm2.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, true);

		claw4 = new ModelRenderer(this);
		claw4.setPos(-2.0F, 10.0F, -1.0F);
		rightArm2.addChild(claw4);
		setRotationAngle(claw4, -0.6545F, 0.0F, 0.0F);
		claw4.texOffs(40, 35).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
		claw4.texOffs(48, 35).addBox(0.5F, 0.0F, 1.0F, 0.0F, 5.0F, 2.0F, 0.0F, true);

		claw5 = new ModelRenderer(this);
		claw5.setPos(0.0F, 4.0F, 0.0F);
		claw4.addChild(claw5);
		setRotationAngle(claw5, 0.7418F, 0.0F, 0.0F);
		claw5.texOffs(40, 43).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		claw5.texOffs(46, 43).addBox(0.51F, 1.0F, 1.0F, 0.0F, 3.0F, 2.0F, 0.0F, true);

		claw6 = new ModelRenderer(this);
		claw6.setPos(0.0F, 4.0F, 0.0F);
		claw5.addChild(claw6);
		claw6.texOffs(41, 50).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		claw6.texOffs(45, 49).addBox(0.5F, 0.0F, 1.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);

		clawSmall4 = new ModelRenderer(this);
		clawSmall4.setPos(-1.0F, 11.0F, 2.0F);
		rightArm2.addChild(clawSmall4);
		setRotationAngle(clawSmall4, 0.2618F, 0.0F, 0.0F);
		clawSmall4.texOffs(52, 35).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		clawSmall5 = new ModelRenderer(this);
		clawSmall5.setPos(0.0F, 2.0F, 0.0F);
		clawSmall4.addChild(clawSmall5);
		setRotationAngle(clawSmall5, -0.4363F, 0.0F, 0.0F);
		clawSmall5.texOffs(52, 40).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		clawSmall6 = new ModelRenderer(this);
		clawSmall6.setPos(0.0F, 2.0F, 0.0F);
		clawSmall5.addChild(clawSmall6);
		clawSmall6.texOffs(52, 46).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -4.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(83, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 15.0F, 8.0F, 0.3F, false);

		ear = new ModelRenderer(this);
		ear.setPos(4.0F, -4.0F, -1.0F);
		head.addChild(ear);
		setRotationAngle(ear, 0.0F, 0.3054F, 0.0F);
		ear.texOffs(88, 53).addBox(0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setPos(-4.0F, -4.0F, -1.0F);
		head.addChild(ear2);
		setRotationAngle(ear2, 0.0F, -0.3054F, 0.0F);
		ear2.texOffs(88, 53).addBox(0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);

		tongue = new ModelRenderer(this);
		tongue.setPos(0.0F, -1.0F, -4.0F);
		head.addChild(tongue);
		setRotationAngle(tongue, 0.3927F, 0.0F, 0.0F);
		tongue.texOffs(21, 32).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		tongue2 = new ModelRenderer(this);
		tongue2.setPos(0.0F, 0.0F, -1.0F);
		tongue.addChild(tongue2);
		setRotationAngle(tongue2, 1.0036F, 0.0F, 0.0F);
		tongue2.texOffs(19, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);

		tongue3 = new ModelRenderer(this);
		tongue3.setPos(0.0F, 0.0F, -3.0F);
		tongue2.addChild(tongue3);
		setRotationAngle(tongue3, -1.0036F, 0.0F, 0.0F);
		tongue3.texOffs(20, 36).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		tongue4 = new ModelRenderer(this);
		tongue4.setPos(0.0F, 0.0F, -2.0F);
		tongue3.addChild(tongue4);
		setRotationAngle(tongue4, -1.2654F, 0.0F, 0.0F);
		tongue4.texOffs(20, 38).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(0.0F, 7.0F, 0.0F);
		

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setPos(-0.1F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg1);
		setRotationAngle(leftLeg1, -0.3054F, 0.0F, 0.0F);
		leftLeg1.texOffs(0, 16).addBox(0.2F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		leftLeg1.texOffs(52, 0).addBox(0.2F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.3F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 7.0F, 0.0F);
		leftLeg1.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 1.0908F, 0.0F, 0.0F);
		leftLeg2.texOffs(0, 29).addBox(0.7F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 6.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
		leftLeg3.texOffs(0, 38).addBox(0.7F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, -0.3F, false);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(1.2F, 5.5F, -1.5F);
		leftLeg3.addChild(leftLeg4);
		setRotationAngle(leftLeg4, 0.1309F, 0.0F, 0.0F);
		leftLeg4.texOffs(1, 48).addBox(-0.4F, -1.5F, -2.5F, 2.0F, 3.0F, 3.0F, -0.3F, false);

		rightLegClawBig2 = new ModelRenderer(this);
		rightLegClawBig2.setPos(2.0F, 0.0F, -2.0F);
		leftLeg4.addChild(rightLegClawBig2);
		rightLegClawBig2.texOffs(0, 55).addBox(-2.6F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		rightLegClawBig3 = new ModelRenderer(this);
		rightLegClawBig3.setPos(0.0F, 0.0F, -1.0F);
		rightLegClawBig2.addChild(rightLegClawBig3);
		rightLegClawBig3.texOffs(0, 61).addBox(-1.6F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(3.2F, 5.5F, -1.5F);
		leftLeg3.addChild(leftLeg5);
		setRotationAngle(leftLeg5, 0.1309F, 0.0F, 0.0F);
		

		rightLegClawBig4 = new ModelRenderer(this);
		rightLegClawBig4.setPos(2.0F, 0.0F, -1.0F);
		leftLeg5.addChild(rightLegClawBig4);
		rightLegClawBig4.texOffs(0, 55).addBox(-2.6F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		rightLegClawBig5 = new ModelRenderer(this);
		rightLegClawBig5.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig4.addChild(rightLegClawBig5);
		rightLegClawBig5.texOffs(0, 61).addBox(-2.1F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		spike = new ModelRenderer(this);
		spike.setPos(2.0F, 7.0F, 0.0F);
		leftLeg2.addChild(spike);
		spike.texOffs(14, 56).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(0.0F, 7.0F, 0.0F);
		

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setPos(-0.1F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg1);
		setRotationAngle(rightLeg1, -0.3054F, 0.0F, 0.0F);
		rightLeg1.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);
		rightLeg1.texOffs(52, 0).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.3F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(-4.0F, 7.0F, 0.0F);
		rightLeg1.addChild(rightLeg2);
		setRotationAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);
		rightLeg2.texOffs(0, 29).addBox(0.7F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(0.0F, 6.0F, 0.0F);
		rightLeg2.addChild(rightLeg3);
		setRotationAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
		rightLeg3.texOffs(0, 38).addBox(0.7F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, -0.3F, true);

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(2.2F, 5.5F, -1.5F);
		rightLeg3.addChild(rightLeg4);
		setRotationAngle(rightLeg4, 0.1309F, 0.0F, 0.0F);
		rightLeg4.texOffs(1, 48).addBox(-0.4F, -1.5F, -2.5F, 2.0F, 3.0F, 3.0F, -0.3F, true);

		rightLegClawBig6 = new ModelRenderer(this);
		rightLegClawBig6.setPos(3.0F, 0.0F, -2.0F);
		rightLeg4.addChild(rightLegClawBig6);
		rightLegClawBig6.texOffs(0, 55).addBox(-3.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, -0.3F, true);

		rightLegClawBig7 = new ModelRenderer(this);
		rightLegClawBig7.setPos(-1.0F, 0.0F, -1.0F);
		rightLegClawBig6.addChild(rightLegClawBig7);
		rightLegClawBig7.texOffs(0, 61).addBox(-2.1F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, -0.2F, true);

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(3.2F, 5.5F, -1.5F);
		rightLeg3.addChild(rightLeg5);
		setRotationAngle(rightLeg5, 0.1309F, 0.0F, 0.0F);
		

		rightLegClawBig8 = new ModelRenderer(this);
		rightLegClawBig8.setPos(0.0F, 0.0F, -1.0F);
		rightLeg5.addChild(rightLegClawBig8);
		rightLegClawBig8.texOffs(0, 55).addBox(-3.1F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, true);

		rightLegClawBig9 = new ModelRenderer(this);
		rightLegClawBig9.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig8.addChild(rightLegClawBig9);
		rightLegClawBig9.texOffs(0, 61).addBox(-2.6F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, true);

		spike2 = new ModelRenderer(this);
		spike2.setPos(2.0F, 7.0F, 0.0F);
		rightLeg2.addChild(spike2);
		spike2.texOffs(14, 56).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}