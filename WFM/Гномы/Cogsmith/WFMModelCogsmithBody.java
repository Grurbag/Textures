// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCogsmithBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer backpack;
	private final ModelRenderer cog;
	private final ModelRenderer cog1_r1;
	private final ModelRenderer cog1_r2;
	private final ModelRenderer cog1_r3;
	private final ModelRenderer cog1_r4;
	private final ModelRenderer cog1_r5;
	private final ModelRenderer cog1_r6;
	private final ModelRenderer cog1_r7;
	private final ModelRenderer cog1_r8;
	private final ModelRenderer cog1_r9;
	private final ModelRenderer cog1_r10;
	private final ModelRenderer cog1_r11;
	private final ModelRenderer pipe;
	private final ModelRenderer pipe_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer endrinharness;
	private final ModelRenderer endrinharness_r1;
	private final ModelRenderer endrinharness_r2;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder_right;
	private final ModelRenderer endrinharnessRight;
	private final ModelRenderer endrinharness_r3;
	private final ModelRenderer endrinharness_r4;

	public WFMModelCogsmithBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));
		Body.cubeList.add(new ModelBox(Body, 19, 54, -5.0F, 9.0F, -3.5F, 10, 3, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 27, 34, -3.5F, 7.0F, 3.5F, 7, 7, 0, -0.5F, false));

		backpack = new ModelRenderer(this);
		backpack.setRotationPoint(0.0F, 7.0F, -4.0F);
		Body.addChild(backpack);
		setRotationAngle(backpack, 0.0F, 0.0F, 0.0F);
		backpack.cubeList.add(new ModelBox(backpack, 36, 40, -4.5F, -6.5F, -4.0F, 9, 9, 5, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 38, 33, -3.5F, -5.5F, -3.5F, 7, 7, 0, 0.0F, false));

		cog = new ModelRenderer(this);
		cog.setRotationPoint(0.0F, -2.0F, -2.0F);
		backpack.addChild(cog);
		cog.cubeList.add(new ModelBox(cog, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog.cubeList.add(new ModelBox(cog, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r1 = new ModelRenderer(this);
		cog1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r1);
		setRotationAngle(cog1_r1, 0.0F, 0.0F, 1.0472F);
		cog1_r1.cubeList.add(new ModelBox(cog1_r1, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r1.cubeList.add(new ModelBox(cog1_r1, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r2 = new ModelRenderer(this);
		cog1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r2);
		setRotationAngle(cog1_r2, 0.0F, 0.0F, 1.5708F);
		cog1_r2.cubeList.add(new ModelBox(cog1_r2, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r2.cubeList.add(new ModelBox(cog1_r2, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r3 = new ModelRenderer(this);
		cog1_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r3);
		setRotationAngle(cog1_r3, 0.0F, 0.0F, 2.0944F);
		cog1_r3.cubeList.add(new ModelBox(cog1_r3, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r3.cubeList.add(new ModelBox(cog1_r3, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r4 = new ModelRenderer(this);
		cog1_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r4);
		setRotationAngle(cog1_r4, 0.0F, 0.0F, 2.618F);
		cog1_r4.cubeList.add(new ModelBox(cog1_r4, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r4.cubeList.add(new ModelBox(cog1_r4, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r5 = new ModelRenderer(this);
		cog1_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r5);
		setRotationAngle(cog1_r5, 0.0F, 0.0F, -3.1416F);
		cog1_r5.cubeList.add(new ModelBox(cog1_r5, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r5.cubeList.add(new ModelBox(cog1_r5, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r6 = new ModelRenderer(this);
		cog1_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r6);
		setRotationAngle(cog1_r6, 0.0F, 0.0F, -2.618F);
		cog1_r6.cubeList.add(new ModelBox(cog1_r6, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r6.cubeList.add(new ModelBox(cog1_r6, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r7 = new ModelRenderer(this);
		cog1_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r7);
		setRotationAngle(cog1_r7, 0.0F, 0.0F, -2.0944F);
		cog1_r7.cubeList.add(new ModelBox(cog1_r7, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r7.cubeList.add(new ModelBox(cog1_r7, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r8 = new ModelRenderer(this);
		cog1_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r8);
		setRotationAngle(cog1_r8, 0.0F, 0.0F, -1.5708F);
		cog1_r8.cubeList.add(new ModelBox(cog1_r8, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r8.cubeList.add(new ModelBox(cog1_r8, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r9 = new ModelRenderer(this);
		cog1_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r9);
		setRotationAngle(cog1_r9, 0.0F, 0.0F, -1.0472F);
		cog1_r9.cubeList.add(new ModelBox(cog1_r9, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r9.cubeList.add(new ModelBox(cog1_r9, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r10 = new ModelRenderer(this);
		cog1_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r10);
		setRotationAngle(cog1_r10, 0.0F, 0.0F, -0.5236F);
		cog1_r10.cubeList.add(new ModelBox(cog1_r10, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r10.cubeList.add(new ModelBox(cog1_r10, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r11 = new ModelRenderer(this);
		cog1_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog.addChild(cog1_r11);
		setRotationAngle(cog1_r11, 0.0F, 0.0F, 0.5236F);
		cog1_r11.cubeList.add(new ModelBox(cog1_r11, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));
		cog1_r11.cubeList.add(new ModelBox(cog1_r11, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		pipe = new ModelRenderer(this);
		pipe.setRotationPoint(0.0F, -5.0F, -4.0F);
		backpack.addChild(pipe);
		pipe.cubeList.add(new ModelBox(pipe, 52, 31, -1.5F, -10.3301F, -4.0F, 3, 6, 3, 0.0F, false));
		pipe.cubeList.add(new ModelBox(pipe, 48, 24, -2.0F, -10.3301F, -4.5F, 4, 1, 4, 0.0F, false));
		pipe.cubeList.add(new ModelBox(pipe, 49, 20, -1.5F, -11.3301F, -4.0F, 3, 1, 3, 0.0F, false));

		pipe_r1 = new ModelRenderer(this);
		pipe_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		pipe.addChild(pipe_r1);
		setRotationAngle(pipe_r1, 0.5236F, 0.0F, 0.0F);
		pipe_r1.cubeList.add(new ModelBox(pipe_r1, 56, 54, -1.0F, -6.0F, -1.0F, 2, 8, 2, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(6.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.89F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 1.09F, true));

		endrinharness = new ModelRenderer(this);
		endrinharness.setRotationPoint(-5.0F, 22.0F, 0.0F);
		LeftArm.addChild(endrinharness);
		

		endrinharness_r1 = new ModelRenderer(this);
		endrinharness_r1.setRotationPoint(10.5F, -18.0F, -0.5F);
		endrinharness.addChild(endrinharness_r1);
		setRotationAngle(endrinharness_r1, 0.0F, 0.0F, -0.6109F);
		endrinharness_r1.cubeList.add(new ModelBox(endrinharness_r1, 53, 9, -1.0F, 2.0F, -1.0F, 2, 2, 3, 0.0F, false));
		endrinharness_r1.cubeList.add(new ModelBox(endrinharness_r1, 57, 0, -0.5F, -3.0F, -0.5F, 1, 5, 2, 0.0F, false));

		endrinharness_r2 = new ModelRenderer(this);
		endrinharness_r2.setRotationPoint(10.5F, -18.0F, -0.5F);
		endrinharness.addChild(endrinharness_r2);
		setRotationAngle(endrinharness_r2, 0.0F, 0.0F, -2.1817F);
		endrinharness_r2.cubeList.add(new ModelBox(endrinharness_r2, 57, 0, -3.5F, -5.0F, -0.5F, 1, 4, 2, 0.0F, false));

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setRotationPoint(2.0F, -0.5F, 0.0F);
		LeftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.2182F);
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 0, 44, -2.75F, -2.5F, -3.5F, 6, 5, 7, 0.5F, true));
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 0, 32, -2.75F, -2.5F, -3.5F, 6, 5, 7, 0.3F, true));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-6.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.89F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 1.09F, false));

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setRotationPoint(-2.0F, -0.5F, 0.0F);
		RightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, -0.3054F);
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 0, 32, -3.25F, -2.7F, -3.5F, 6, 5, 7, 0.3F, false));
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 0, 44, -3.25F, -2.7F, -3.5F, 6, 5, 7, 0.5F, false));

		endrinharnessRight = new ModelRenderer(this);
		endrinharnessRight.setRotationPoint(-6.2676F, 6.0754F, 0.0F);
		RightArm.addChild(endrinharnessRight);
		setRotationAngle(endrinharnessRight, 0.0F, 3.1416F, 0.0F);
		

		endrinharness_r3 = new ModelRenderer(this);
		endrinharness_r3.setRotationPoint(-0.2324F, -2.0754F, -0.5F);
		endrinharnessRight.addChild(endrinharness_r3);
		setRotationAngle(endrinharness_r3, 0.0F, 0.0F, -0.6109F);
		endrinharness_r3.cubeList.add(new ModelBox(endrinharness_r3, 53, 9, -1.0F, 2.0F, -1.0F, 2, 2, 3, 0.0F, true));
		endrinharness_r3.cubeList.add(new ModelBox(endrinharness_r3, 57, 0, -0.5F, -3.0F, -0.5F, 1, 5, 2, 0.0F, true));

		endrinharness_r4 = new ModelRenderer(this);
		endrinharness_r4.setRotationPoint(-0.2324F, -2.0754F, -0.5F);
		endrinharnessRight.addChild(endrinharness_r4);
		setRotationAngle(endrinharness_r4, 0.0F, 0.0F, -2.1817F);
		endrinharness_r4.cubeList.add(new ModelBox(endrinharness_r4, 57, 0, -3.5F, -5.0F, -0.5F, 1, 4, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}