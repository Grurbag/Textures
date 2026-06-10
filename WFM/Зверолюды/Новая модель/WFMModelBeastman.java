// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBeastman extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedBody2;
	private final ModelRenderer bipedHead;
	private final ModelRenderer mouth;
	private final ModelRenderer borodka_r1;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right_2;
	private final ModelRenderer horn_right_r1;
	private final ModelRenderer horn_right_3;
	private final ModelRenderer horn_right_r2;
	private final ModelRenderer horn_right_4;
	private final ModelRenderer horn_right_r3;
	private final ModelRenderer horn_right_5;
	private final ModelRenderer horn_right_r4;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left_r1;
	private final ModelRenderer horn_left3;
	private final ModelRenderer horn_left_r2;
	private final ModelRenderer horn_left4;
	private final ModelRenderer horn_left_r3;
	private final ModelRenderer horn_left5;
	private final ModelRenderer horn_left_r4;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer bipedLeftLeg2;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer bipedLeftLeg3;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer bipedRightLeg2;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer bipedRightLeg3;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedLeftArm2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedRightArm2;

	public WFMModelBeastman() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, -3.0F, 0.5F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 30, 51, -5.0F, 0.0F, -3.5F, 10, 6, 7, 0.0F, false));

		bipedBody2 = new ModelRenderer(this);
		bipedBody2.setRotationPoint(0.0F, 9.0F, 0.0F);
		bipedBody.addChild(bipedBody2);
		bipedBody2.cubeList.add(new ModelBox(bipedBody2, 12, 39, -4.0F, -3.0F, -2.5F, 8, 6, 5, 0.0F, false));

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, -2.0F, -1.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -5.0F, 8, 8, 8, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 32, 0, -4.0F, -8.0F, -5.0F, 8, 8, 8, 0.3F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 2.4959F, -4.1234F);
		bipedHead.addChild(mouth);
		setRotationAngle(mouth, 0.2182F, 0.0F, 0.0F);
		

		borodka_r1 = new ModelRenderer(this);
		borodka_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mouth.addChild(borodka_r1);
		setRotationAngle(borodka_r1, -0.0873F, 0.0F, 0.0F);
		borodka_r1.cubeList.add(new ModelBox(borodka_r1, 58, 11, -1.5F, -2.9658F, -2.8545F, 3, 4, 0, 0.0F, false));

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setRotationPoint(-1.0F, 1.0F, -1.0F);
		mouth.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.3927F, 0.0F, 0.0F);
		teeth_r1.cubeList.add(new ModelBox(teeth_r1, 0, 16, -1.5F, -6.2766F, -0.7057F, 5, 3, 4, -0.6F, false));
		teeth_r1.cubeList.add(new ModelBox(teeth_r1, 0, 16, -1.5F, -9.2766F, -0.7057F, 5, 3, 4, -0.6F, false));
		teeth_r1.cubeList.add(new ModelBox(teeth_r1, 0, 25, -2.0F, -10.2766F, -0.7057F, 6, 7, 7, -0.5F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.0F, 0.0F, -1.0F);
		bipedHead.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, -0.4363F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 0, 0, 0.0F, -6.0F, 0.0F, 4, 4, 0, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-4.0F, 0.0F, -1.0F);
		bipedHead.addChild(ear_right);
		setRotationAngle(ear_right, -3.1416F, -0.6109F, 3.1416F);
		ear_right.cubeList.add(new ModelBox(ear_right, 0, 0, 0.0F, -6.0F, 0.0F, 4, 4, 0, 0.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-3.0F, -3.0F, -1.0F);
		bipedHead.addChild(horn_right);
		horn_right.cubeList.add(new ModelBox(horn_right, 0, 58, -4.0F, -7.0F, -1.0F, 5, 3, 3, 0.0F, false));

		horn_right_2 = new ModelRenderer(this);
		horn_right_2.setRotationPoint(0.0F, 1.0F, 0.0F);
		horn_right.addChild(horn_right_2);
		setRotationAngle(horn_right_2, 0.0F, 0.0F, 0.2182F);
		

		horn_right_r1 = new ModelRenderer(this);
		horn_right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_right_2.addChild(horn_right_r1);
		setRotationAngle(horn_right_r1, 0.0F, 0.0F, 0.1745F);
		horn_right_r1.cubeList.add(new ModelBox(horn_right_r1, 0, 51, -6.5307F, -5.6955F, -0.5F, 2, 5, 2, 0.0F, false));

		horn_right_3 = new ModelRenderer(this);
		horn_right_3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		horn_right_2.addChild(horn_right_3);
		

		horn_right_r2 = new ModelRenderer(this);
		horn_right_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_right_3.addChild(horn_right_r2);
		setRotationAngle(horn_right_r2, 0.2618F, 0.0F, 0.1745F);
		horn_right_r2.cubeList.add(new ModelBox(horn_right_r2, 0, 45, -6.0307F, -1.5696F, -2.5435F, 2, 2, 4, -0.2F, false));

		horn_right_4 = new ModelRenderer(this);
		horn_right_4.setRotationPoint(-1.0F, 0.2456F, -1.3927F);
		horn_right_3.addChild(horn_right_4);
		setRotationAngle(horn_right_4, -0.6109F, 0.0F, 0.0F);
		

		horn_right_r3 = new ModelRenderer(this);
		horn_right_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_right_4.addChild(horn_right_r3);
		setRotationAngle(horn_right_r3, 0.2618F, 0.0F, 0.1745F);
		horn_right_r3.cubeList.add(new ModelBox(horn_right_r3, 0, 42, -4.4081F, -0.4775F, -2.8871F, 1, 1, 2, 0.0F, false));

		horn_right_5 = new ModelRenderer(this);
		horn_right_5.setRotationPoint(0.0F, 1.1472F, -1.6383F);
		horn_right_4.addChild(horn_right_5);
		setRotationAngle(horn_right_5, -0.3491F, 0.0F, 0.0F);
		

		horn_right_r4 = new ModelRenderer(this);
		horn_right_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_right_5.addChild(horn_right_r4);
		setRotationAngle(horn_right_r4, 0.2618F, 0.0F, 0.1745F);
		horn_right_r4.cubeList.add(new ModelBox(horn_right_r4, 0, 39, -4.5416F, -0.8135F, -3.0579F, 1, 1, 2, -0.2F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(6.0F, -3.0F, -1.0F);
		bipedHead.addChild(horn_left);
		horn_left.cubeList.add(new ModelBox(horn_left, 0, 58, -4.0F, -7.0F, -1.0F, 5, 3, 3, 0.0F, true));

		horn_left2 = new ModelRenderer(this);
		horn_left2.setRotationPoint(4.0F, -3.0F, 0.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, -0.7854F);
		

		horn_left_r1 = new ModelRenderer(this);
		horn_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left2.addChild(horn_left_r1);
		setRotationAngle(horn_left_r1, 0.0F, 0.0F, 0.1745F);
		horn_left_r1.cubeList.add(new ModelBox(horn_left_r1, 0, 51, -2.7057F, -5.2766F, -0.5F, 2, 5, 2, 0.0F, true));

		horn_left3 = new ModelRenderer(this);
		horn_left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left2.addChild(horn_left3);
		

		horn_left_r2 = new ModelRenderer(this);
		horn_left_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left3.addChild(horn_left_r2);
		setRotationAngle(horn_left_r2, 0.2618F, 0.0F, 0.1745F);
		horn_left_r2.cubeList.add(new ModelBox(horn_left_r2, 0, 45, -2.2057F, -1.165F, -2.652F, 2, 2, 4, -0.2F, true));

		horn_left4 = new ModelRenderer(this);
		horn_left4.setRotationPoint(-1.0F, 0.2456F, -1.3927F);
		horn_left3.addChild(horn_left4);
		setRotationAngle(horn_left4, -0.6109F, 0.0F, 0.0F);
		

		horn_left_r3 = new ModelRenderer(this);
		horn_left_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left4.addChild(horn_left_r3);
		setRotationAngle(horn_left_r3, 0.2618F, 0.0F, 0.1745F);
		horn_left_r3.cubeList.add(new ModelBox(horn_left_r3, 0, 42, -0.6169F, -0.0983F, -2.3494F, 1, 1, 2, 0.0F, true));

		horn_left5 = new ModelRenderer(this);
		horn_left5.setRotationPoint(0.0F, 1.1472F, -1.6383F);
		horn_left4.addChild(horn_left5);
		setRotationAngle(horn_left5, -0.3491F, 0.0F, 0.0F);
		

		horn_left_r4 = new ModelRenderer(this);
		horn_left_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		horn_left5.addChild(horn_left_r4);
		setRotationAngle(horn_left_r4, 0.2618F, 0.0F, 0.1745F);
		horn_left_r4.cubeList.add(new ModelBox(horn_left_r4, 0, 39, -0.7963F, -0.6173F, -2.1973F, 1, 1, 2, -0.2F, true));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-0.1F, 8.9544F, -0.5209F);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.1F, 0.0456F, 0.5209F);
		bipedLeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.1745F, 0.0F, 0.0F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 48, 17, -0.1F, -1.0F, -2.0F, 4, 8, 4, 0.0F, false));

		bipedLeftLeg2 = new ModelRenderer(this);
		bipedLeftLeg2.setRotationPoint(2.1F, 7.8196F, 1.4444F);
		bipedLeftLeg.addChild(bipedLeftLeg2);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(1.0F, -1.774F, -0.9235F);
		bipedLeftLeg2.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 50, 29, -2.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));

		bipedLeftLeg3 = new ModelRenderer(this);
		bipedLeftLeg3.setRotationPoint(0.0F, 4.661F, 0.3852F);
		bipedLeftLeg2.addChild(bipedLeftLeg3);
		bipedLeftLeg3.cubeList.add(new ModelBox(bipedLeftLeg3, 48, 39, -2.0F, -3.0F, -2.0F, 4, 6, 4, 0.0F, false));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-0.1F, 8.9544F, -0.5209F);
		

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(0.1F, 0.0456F, 0.5209F);
		bipedRightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.1745F, 0.0F, 0.0F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, 48, 17, -4.1F, -1.0F, -2.0F, 4, 8, 4, 0.0F, true));

		bipedRightLeg2 = new ModelRenderer(this);
		bipedRightLeg2.setRotationPoint(-1.9F, 7.8196F, 1.4444F);
		bipedRightLeg.addChild(bipedRightLeg2);
		

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(1.0F, -1.774F, -0.9235F);
		bipedRightLeg2.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.48F, 0.0F, 0.0F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 50, 29, -2.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));

		bipedRightLeg3 = new ModelRenderer(this);
		bipedRightLeg3.setRotationPoint(0.0F, 4.661F, 0.3852F);
		bipedRightLeg2.addChild(bipedRightLeg3);
		bipedRightLeg3.cubeList.add(new ModelBox(bipedRightLeg3, 48, 39, -2.0F, -3.0F, -2.0F, 4, 6, 4, 0.0F, true));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(4.5F, -1.5F, 0.5F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 29, 16, 0.5F, -1.5F, -2.5F, 3, 5, 5, 0.0F, false));

		bipedLeftArm2 = new ModelRenderer(this);
		bipedLeftArm2.setRotationPoint(2.5F, 8.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArm2);
		bipedLeftArm2.cubeList.add(new ModelBox(bipedLeftArm2, 30, 26, -2.0F, -4.5F, -2.0F, 4, 9, 4, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.5F, -1.5F, 0.5F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 29, 16, -3.5F, -1.5F, -2.5F, 3, 5, 5, 0.0F, true));

		bipedRightArm2 = new ModelRenderer(this);
		bipedRightArm2.setRotationPoint(-2.5F, 8.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArm2);
		bipedRightArm2.cubeList.add(new ModelBox(bipedRightArm2, 30, 26, -2.0F, -4.5F, -2.0F, 4, 9, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		bipedHead.render(f5);
		bipedLeftLeg.render(f5);
		bipedRightLeg.render(f5);
		bipedLeftArm.render(f5);
		bipedRightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}