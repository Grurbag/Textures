// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenNew extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer earRight_r1;
	private final ModelRenderer earLeft_r1;
	private final ModelRenderer jaw_top;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer teeth_mouth_r1;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArmLower;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLegFur_r1;
	private final ModelRenderer leftLegLower;
	private final ModelRenderer leftLegLowest_r1;
	private final ModelRenderer leftLegLower_r1;
	private final ModelRenderer tail;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLegFur_r1;
	private final ModelRenderer rightLegLower;
	private final ModelRenderer rightLegLowest_r1;
	private final ModelRenderer rightLegLower_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArmLower;

	public WFMModelSkavenNew() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -4.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -6.0F, -7.0F, 7, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 45, -3.5F, -6.0F, -7.0F, 7, 6, 6, 0.2F, false));

		earRight_r1 = new ModelRenderer(this);
		earRight_r1.setRotationPoint(-3.5F, -4.5F, -3.0F);
		head.addChild(earRight_r1);
		setRotationAngle(earRight_r1, 0.2182F, -0.3054F, 0.0F);
		earRight_r1.cubeList.add(new ModelBox(earRight_r1, 22, 0, -0.5F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

		earLeft_r1 = new ModelRenderer(this);
		earLeft_r1.setRotationPoint(4.5F, -4.5F, -3.0F);
		head.addChild(earLeft_r1);
		setRotationAngle(earLeft_r1, 0.2182F, 0.3054F, 0.0F);
		earLeft_r1.cubeList.add(new ModelBox(earLeft_r1, 41, -4, -0.5F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

		jaw_top = new ModelRenderer(this);
		jaw_top.setRotationPoint(0.0F, -3.6667F, -9.0333F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1745F, 0.0F, 0.0F);
		jaw_top.cubeList.add(new ModelBox(jaw_top, 44, 0, -2.5F, -1.9333F, -2.4667F, 5, 3, 5, 0.0F, false));
		jaw_top.cubeList.add(new ModelBox(jaw_top, 20, 0, -1.0F, -2.3333F, -2.9667F, 2, 2, 2, -0.2F, false));
		jaw_top.cubeList.add(new ModelBox(jaw_top, 1, 0, -1.0F, 0.6667F, -2.3667F, 2, 3, 0, 0.0F, false));
		jaw_top.cubeList.add(new ModelBox(jaw_top, 29, 7, -2.0F, 0.6667F, -2.4667F, 4, 1, 5, 0.0F, false));

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setRotationPoint(0.0F, -0.5F, -7.0F);
		head.addChild(jaw_bot);
		

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
		jaw_bot.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.3054F, 0.0F, 0.0F);
		teeth_r1.cubeList.add(new ModelBox(teeth_r1, 0, 4, -1.0F, -1.0F, 0.0F, 2, 2, 0, 0.0F, false));

		teeth_mouth_r1 = new ModelRenderer(this);
		teeth_mouth_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_mouth_r1);
		setRotationAngle(teeth_mouth_r1, 0.3054F, 0.0F, 0.0F);
		teeth_mouth_r1.cubeList.add(new ModelBox(teeth_mouth_r1, 29, 0, -1.5F, -0.5F, -2.5F, 3, 2, 5, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		jaw_bot.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3054F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 46, 8, -2.0F, -1.0F, -3.0F, 4, 2, 5, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 13, -4.0F, -6.0F, -2.0F, 8, 12, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 29, -4.0F, -6.0F, -2.0F, 8, 12, 4, 0.2F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(4.0F, 4.0F, -4.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 40, 15, 0.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F, true));
		leftArm.cubeList.add(new ModelBox(leftArm, 40, 38, 0.0F, -2.0F, -2.0F, 4, 6, 4, 0.2F, true));

		leftArmLower = new ModelRenderer(this);
		leftArmLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftArm.addChild(leftArmLower);
		leftArmLower.cubeList.add(new ModelBox(leftArmLower, 40, 25, 0.0F, 3.0F, -2.0F, 4, 9, 4, -0.5F, true));
		leftArmLower.cubeList.add(new ModelBox(leftArmLower, 42, 48, 0.0F, 3.0F, -2.0F, 4, 9, 4, -0.3F, true));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
		

		leftLegFur_r1 = new ModelRenderer(this);
		leftLegFur_r1.setRotationPoint(-6.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLegFur_r1);
		setRotationAngle(leftLegFur_r1, -0.4363F, 0.0F, 0.0F);
		leftLegFur_r1.cubeList.add(new ModelBox(leftLegFur_r1, 0, 41, 4.0F, 0.0F, -2.0F, 4, 8, 4, 0.2F, true));
		leftLegFur_r1.cubeList.add(new ModelBox(leftLegFur_r1, 0, 13, 4.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F, false));

		leftLegLower = new ModelRenderer(this);
		leftLegLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLegLower);
		

		leftLegLowest_r1 = new ModelRenderer(this);
		leftLegLowest_r1.setRotationPoint(0.0F, 11.606F, -3.9278F);
		leftLegLower.addChild(leftLegLowest_r1);
		setRotationAngle(leftLegLowest_r1, -0.1745F, 0.0F, 0.0F);
		leftLegLowest_r1.cubeList.add(new ModelBox(leftLegLowest_r1, 0, 36, -2.0F, -0.5F, -2.5F, 4, 1, 4, 0.0F, false));

		leftLegLower_r1 = new ModelRenderer(this);
		leftLegLower_r1.setRotationPoint(-0.1F, 5.0F, -3.0F);
		leftLegLower.addChild(leftLegLower_r1);
		setRotationAngle(leftLegLower_r1, 0.0873F, 0.0F, 0.0F);
		leftLegLower_r1.cubeList.add(new ModelBox(leftLegLower_r1, 0, 25, -2.0F, 0.0F, -2.0F, 4, 7, 4, -0.5F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 12.0F, 1.0F);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 60, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 8, 42, 0.0F, -3.0F, 2.0F, 0, 7, 15, 0.0F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
		

		rightLegFur_r1 = new ModelRenderer(this);
		rightLegFur_r1.setRotationPoint(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLegFur_r1);
		setRotationAngle(rightLegFur_r1, -0.4363F, 0.0F, 0.0F);
		rightLegFur_r1.cubeList.add(new ModelBox(rightLegFur_r1, 0, 41, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.2F, true));
		rightLegFur_r1.cubeList.add(new ModelBox(rightLegFur_r1, 0, 13, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F, true));

		rightLegLower = new ModelRenderer(this);
		rightLegLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLegLower);
		

		rightLegLowest_r1 = new ModelRenderer(this);
		rightLegLowest_r1.setRotationPoint(0.0F, 11.606F, -3.9278F);
		rightLegLower.addChild(rightLegLowest_r1);
		setRotationAngle(rightLegLowest_r1, -0.1745F, 0.0F, 0.0F);
		rightLegLowest_r1.cubeList.add(new ModelBox(rightLegLowest_r1, 0, 36, -2.0F, -0.5F, -2.5F, 4, 1, 4, 0.0F, true));

		rightLegLower_r1 = new ModelRenderer(this);
		rightLegLower_r1.setRotationPoint(-0.1F, 5.0F, -3.0F);
		rightLegLower.addChild(rightLegLower_r1);
		setRotationAngle(rightLegLower_r1, 0.0873F, 0.0F, 0.0F);
		rightLegLower_r1.cubeList.add(new ModelBox(rightLegLower_r1, 0, 25, -2.0F, 0.0F, -2.0F, 4, 7, 4, -0.5F, true));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-4.0F, 4.0F, -4.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 40, 15, -4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F, true));
		rightArm.cubeList.add(new ModelBox(rightArm, 40, 38, -4.0F, -2.0F, -2.0F, 4, 6, 4, 0.2F, true));

		rightArmLower = new ModelRenderer(this);
		rightArmLower.setRotationPoint(-8.0F, 27.0F, 0.0F);
		rightArm.addChild(rightArmLower);
		rightArmLower.cubeList.add(new ModelBox(rightArmLower, 40, 25, 4.0F, -24.0F, -2.0F, 4, 9, 4, -0.5F, true));
		rightArmLower.cubeList.add(new ModelBox(rightArmLower, 42, 48, 4.0F, -24.0F, -2.0F, 4, 9, 4, -0.3F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		Body.render(f5);
		leftArm.render(f5);
		leftLeg.render(f5);
		tail.render(f5);
		rightLeg.render(f5);
		rightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}