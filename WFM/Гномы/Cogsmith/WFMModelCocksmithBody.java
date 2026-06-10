// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCocksmithBody extends ModelBase {
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
	private final ModelRenderer pipe_r2;
	private final ModelRenderer pipe2;
	private final ModelRenderer pipe_r3;
	private final ModelRenderer pipe_r4;
	private final ModelRenderer backpack2;
	private final ModelRenderer cog3;
	private final ModelRenderer cog1_r12;
	private final ModelRenderer cog1_r13;
	private final ModelRenderer cog1_r14;
	private final ModelRenderer cog1_r15;
	private final ModelRenderer cog1_r16;
	private final ModelRenderer cog1_r17;
	private final ModelRenderer cog1_r18;
	private final ModelRenderer cog1_r19;
	private final ModelRenderer cog1_r20;
	private final ModelRenderer cog1_r21;
	private final ModelRenderer cog1_r22;
	private final ModelRenderer LeftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelCocksmithBody() {
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
		pipe.setRotationPoint(-3.0F, -5.0F, -3.0F);
		backpack.addChild(pipe);
		setRotationAngle(pipe, -0.1796F, -0.1245F, -0.5996F);
		

		pipe_r1 = new ModelRenderer(this);
		pipe_r1.setRotationPoint(-1.0F, -4.3301F, -2.5F);
		pipe.addChild(pipe_r1);
		setRotationAngle(pipe_r1, 0.48F, 0.0F, 0.0F);
		pipe_r1.cubeList.add(new ModelBox(pipe_r1, 49, 20, -0.5F, -7.0F, -1.5F, 3, 1, 3, 0.5F, false));
		pipe_r1.cubeList.add(new ModelBox(pipe_r1, 48, 24, -1.0F, -6.0F, -2.0F, 4, 1, 4, 0.5F, false));
		pipe_r1.cubeList.add(new ModelBox(pipe_r1, 52, 31, -0.5F, -6.0F, -1.5F, 3, 6, 3, 0.5F, false));

		pipe_r2 = new ModelRenderer(this);
		pipe_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		pipe.addChild(pipe_r2);
		setRotationAngle(pipe_r2, 0.5236F, 0.0F, 0.0F);
		pipe_r2.cubeList.add(new ModelBox(pipe_r2, 56, 54, -1.0F, -6.0F, -1.5F, 2, 8, 2, 0.5F, false));

		pipe2 = new ModelRenderer(this);
		pipe2.setRotationPoint(3.0F, -5.0F, -3.0F);
		backpack.addChild(pipe2);
		setRotationAngle(pipe2, -0.1741F, 0.1321F, 0.6429F);
		

		pipe_r3 = new ModelRenderer(this);
		pipe_r3.setRotationPoint(-1.0F, -4.3301F, -2.5F);
		pipe2.addChild(pipe_r3);
		setRotationAngle(pipe_r3, 0.48F, 0.0F, 0.0F);
		pipe_r3.cubeList.add(new ModelBox(pipe_r3, 49, 20, -0.5F, -7.0F, -1.5F, 3, 1, 3, 0.5F, false));
		pipe_r3.cubeList.add(new ModelBox(pipe_r3, 48, 24, -1.0F, -6.0F, -2.0F, 4, 1, 4, 0.5F, false));
		pipe_r3.cubeList.add(new ModelBox(pipe_r3, 52, 31, -0.5F, -6.0F, -1.5F, 3, 6, 3, 0.5F, false));

		pipe_r4 = new ModelRenderer(this);
		pipe_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
		pipe2.addChild(pipe_r4);
		setRotationAngle(pipe_r4, 0.5236F, 0.0F, 0.0F);
		pipe_r4.cubeList.add(new ModelBox(pipe_r4, 56, 54, -1.0F, -6.0F, -1.5F, 2, 8, 2, 0.5F, false));

		backpack2 = new ModelRenderer(this);
		backpack2.setRotationPoint(0.0F, 10.0F, 2.0F);
		Body.addChild(backpack2);
		setRotationAngle(backpack2, -3.1416F, 0.0F, 3.1416F);
		backpack2.cubeList.add(new ModelBox(backpack2, 36, 40, -4.5F, -6.5F, -3.0F, 9, 9, 5, 0.0F, false));
		backpack2.cubeList.add(new ModelBox(backpack2, 38, 33, -3.5F, -5.5F, -2.5F, 7, 7, 0, 0.0F, false));

		cog3 = new ModelRenderer(this);
		cog3.setRotationPoint(0.0F, -2.0F, -2.0F);
		backpack2.addChild(cog3);
		cog3.cubeList.add(new ModelBox(cog3, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog3.cubeList.add(new ModelBox(cog3, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r12 = new ModelRenderer(this);
		cog1_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r12);
		setRotationAngle(cog1_r12, 0.0F, 0.0F, 1.0472F);
		cog1_r12.cubeList.add(new ModelBox(cog1_r12, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r12.cubeList.add(new ModelBox(cog1_r12, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r13 = new ModelRenderer(this);
		cog1_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r13);
		setRotationAngle(cog1_r13, 0.0F, 0.0F, 1.5708F);
		cog1_r13.cubeList.add(new ModelBox(cog1_r13, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r13.cubeList.add(new ModelBox(cog1_r13, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r14 = new ModelRenderer(this);
		cog1_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r14);
		setRotationAngle(cog1_r14, 0.0F, 0.0F, 2.0944F);
		cog1_r14.cubeList.add(new ModelBox(cog1_r14, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r14.cubeList.add(new ModelBox(cog1_r14, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r15 = new ModelRenderer(this);
		cog1_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r15);
		setRotationAngle(cog1_r15, 0.0F, 0.0F, 2.618F);
		cog1_r15.cubeList.add(new ModelBox(cog1_r15, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r15.cubeList.add(new ModelBox(cog1_r15, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r16 = new ModelRenderer(this);
		cog1_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r16);
		setRotationAngle(cog1_r16, 0.0F, 0.0F, -3.1416F);
		cog1_r16.cubeList.add(new ModelBox(cog1_r16, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r16.cubeList.add(new ModelBox(cog1_r16, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r17 = new ModelRenderer(this);
		cog1_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r17);
		setRotationAngle(cog1_r17, 0.0F, 0.0F, -2.618F);
		cog1_r17.cubeList.add(new ModelBox(cog1_r17, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r17.cubeList.add(new ModelBox(cog1_r17, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r18 = new ModelRenderer(this);
		cog1_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r18);
		setRotationAngle(cog1_r18, 0.0F, 0.0F, -2.0944F);
		cog1_r18.cubeList.add(new ModelBox(cog1_r18, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r18.cubeList.add(new ModelBox(cog1_r18, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r19 = new ModelRenderer(this);
		cog1_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r19);
		setRotationAngle(cog1_r19, 0.0F, 0.0F, -1.5708F);
		cog1_r19.cubeList.add(new ModelBox(cog1_r19, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r19.cubeList.add(new ModelBox(cog1_r19, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r20 = new ModelRenderer(this);
		cog1_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r20);
		setRotationAngle(cog1_r20, 0.0F, 0.0F, -1.0472F);
		cog1_r20.cubeList.add(new ModelBox(cog1_r20, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r20.cubeList.add(new ModelBox(cog1_r20, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r21 = new ModelRenderer(this);
		cog1_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r21);
		setRotationAngle(cog1_r21, 0.0F, 0.0F, -0.5236F);
		cog1_r21.cubeList.add(new ModelBox(cog1_r21, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r21.cubeList.add(new ModelBox(cog1_r21, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r22 = new ModelRenderer(this);
		cog1_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		cog3.addChild(cog1_r22);
		setRotationAngle(cog1_r22, 0.0F, 0.0F, 0.5236F);
		cog1_r22.cubeList.add(new ModelBox(cog1_r22, 6, 60, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));
		cog1_r22.cubeList.add(new ModelBox(cog1_r22, 0, 61, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(6.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.89F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 1.09F, true));

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